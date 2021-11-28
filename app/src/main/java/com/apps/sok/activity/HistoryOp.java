package com.apps.sok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.sok.MainActivity;
import com.apps.sok.R;
import com.apps.sok.activity.HistoryActivity;

public class HistoryOp extends AppCompatActivity {

    TextView textView9;
    ImageView imageView, backHistory1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_op);
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        textView9 = findViewById(R.id.textView9);
        textView9.setOnClickListener(v -> {
            startActivity(new Intent(this, HistoryActivity.class));
            overridePendingTransition(R.anim.slidein, R.anim.slideout);
            finish();
        });
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(v -> {
            startActivity(new Intent(this, HistoryActivity.class));
            overridePendingTransition(R.anim.slidein, R.anim.slideout);
            finish();
        });

        backHistory1 = findViewById(R.id.backHistory1);
        backHistory1.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
            finish();
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
        finish();
    }
}