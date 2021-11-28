package com.apps.sok.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.apps.sok.MainActivity
import com.apps.sok.R

class PriceListTarif : AppCompatActivity() {

    lateinit var backPr: ImageView
    lateinit var kupit: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_price_list_tarif)
        window.statusBarColor = resources.getColor(R.color.blue)


        backPr = findViewById(R.id.backPr)
        backPr.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })

        kupit = findViewById(R.id.kupit)
        kupit.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (this, PriobretenieUslugActivity::class.java)
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