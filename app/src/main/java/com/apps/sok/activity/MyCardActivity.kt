package com.apps.sok.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.apps.sok.MainActivity
import com.apps.sok.R

class MyCardActivity : AppCompatActivity() {

    lateinit var backMyCard: ImageView
    lateinit var card1: TextView
    lateinit var cardimg1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_card)
        window.statusBarColor = resources.getColor(R.color.blue)

        cardimg1 = findViewById(R.id.cardimg1)
        cardimg1.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MyCardRen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein, R.anim.slideout)
            finish()
        })

        card1 = findViewById(R.id.card1)
        card1.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MyCardRen::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein, R.anim.slideout)
            finish()
        })

        backMyCard = findViewById(R.id.backMyCard)
        backMyCard.setOnClickListener(View.OnClickListener { view: View? ->
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