package com.apps.sok.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.apps.sok.MainActivity
import com.apps.sok.R

class Kontakti : AppCompatActivity() {

    lateinit var backKon: ImageView
    lateinit var vk: ImageView
    lateinit var insta: ImageView
    lateinit var whats: ImageView
    lateinit var site: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontakti)
        window.statusBarColor = resources.getColor(R.color.blue)

        vk = findViewById(R.id.vk)
        vk.setOnClickListener { view: View? ->
            val myWebLink = Intent(Intent.ACTION_VIEW)
            myWebLink.data = Uri.parse("https://vk.com/glksok")
            startActivity(myWebLink)
        }
        site = findViewById(R.id.site)
        site.setOnClickListener { view: View? ->
            val myWebLink = Intent(Intent.ACTION_VIEW)
            myWebLink.data = Uri.parse("https://glksok.ru/")
            startActivity(myWebLink)
        }

        insta = findViewById(R.id.insta)
        insta.setOnClickListener { view: View? ->
            val myWebLink = Intent(Intent.ACTION_VIEW)
            myWebLink.data = Uri.parse("https://www.instagram.com/glksok/")
            startActivity(myWebLink)
        }
        whats = findViewById(R.id.whats)
        whats.setOnClickListener { view: View? ->
            val myWebLink = Intent(Intent.ACTION_VIEW)
            myWebLink.data = Uri.parse("https://wa.me/+79879058931")
            startActivity(myWebLink)
        }

        backKon = findViewById(R.id.backKon)
        backKon.setOnClickListener { view: View? ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
        finish()
    }
}