package com.apps.sok.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.apps.sok.MainActivity
import com.apps.sok.R

class InfoPogoda : AppCompatActivity() {

    lateinit var backMyCard11: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pogoda)
        window.statusBarColor = resources.getColor(R.color.blue)

        backMyCard11 = findViewById(R.id.backInfoPag)
        backMyCard11.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
        finish()
    }
}