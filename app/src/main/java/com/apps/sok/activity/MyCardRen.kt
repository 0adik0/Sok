package com.apps.sok.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import com.apps.sok.MainActivity
import com.apps.sok.R

class MyCardRen : AppCompatActivity() {

    lateinit var backMyCard11: ImageView
    lateinit var btnLog11: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_card_ren)
        window.statusBarColor = resources.getColor(R.color.blue)

        btnLog11 = findViewById(R.id.btnLog11)
        btnLog11.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })

        backMyCard11 = findViewById(R.id.backMyCard11)
        backMyCard11.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MyCardActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MyCardActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
        finish()
    }
}