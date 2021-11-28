package com.apps.sok.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.sok.R;

public class ForgotPassword1 extends AppCompatActivity {

    ImageView imageView3;
    Button btnLog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password1);

        btnLog1 = findViewById(R.id.btnLog1);
        btnLog1.setOnClickListener(view -> {
            Intent intent = new Intent(ForgotPassword1.this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slidein1, R.anim.slidein1);
            finish();
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(view -> {
            Intent intent = new Intent(ForgotPassword1.this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
            finish();
        });
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(ForgotPassword1.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
        finish();
    }
}