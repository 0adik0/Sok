package com.apps.sok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.apps.sok.R;

public class HistoryActivity extends AppCompatActivity {

    ImageView backh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        backh = findViewById(R.id.backh);
        backh.setOnClickListener(v -> {
            startActivity(new Intent(this, HistoryOp.class));
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
            finish();
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, HistoryOp.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
        finish();
    }
}