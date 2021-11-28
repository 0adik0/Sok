package com.apps.sok.auth;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.sok.R;

public class RegisterActivity extends AppCompatActivity {

    ImageView imageView3;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // TODO Auto-generated method stub
            }
            @Override
            public void afterTextChanged(Editable s)
            {
                String text = editText.getText().toString();
                int  textLength = editText.getText().length();
                if (text.endsWith("-") || text.endsWith(" ") || text.endsWith(" "))
                    return;
                if (textLength == 1) {
                    if (!text.contains("("))
                    {
                        editText.setText(new StringBuilder(text).insert(text.length() - 1, "+7 (").toString());
                        editText.setSelection(editText.getText().length());
                    }
                }
                else if (textLength == 8)
                {
                    if (!text.contains(")"))
                    {
                        editText.setText(new StringBuilder(text).insert(text.length() - 1, ") ").toString());
                        editText.setSelection(editText.getText().length());
                    }
                }
                else if (textLength == 13)
                {
                    editText.setText(new StringBuilder(text).insert(text.length() - 1, "-").toString());
                    editText.setSelection(editText.getText().length());
                }
                else if (textLength == 14)
                {
                    if (!text.contains("-"))
                    {
                        editText.setText(new StringBuilder(text).insert(text.length() - 1, "-").toString());
                        editText.setSelection(editText.getText().length());
                    }
                }
                else if (textLength == 16)
                {
                    editText.setText(new StringBuilder(text).insert(text.length() - 1, "-").toString());
                    editText.setSelection(editText.getText().length());
                }
            }
        });


        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
        finish();
    }
}