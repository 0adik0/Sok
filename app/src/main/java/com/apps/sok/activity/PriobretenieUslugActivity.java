package com.apps.sok.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;

import com.apps.sok.MainActivity;
import com.apps.sok.R;

public class PriobretenieUslugActivity extends AppCompatActivity {

    AppCompatButton oplataS;
    ImageView backPri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priobretenie_uslug);
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        backPri = findViewById(R.id.backPri);
        backPri.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2);
            finish();
        });

        oplataS = findViewById(R.id.oplataS);
        oplataS.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
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