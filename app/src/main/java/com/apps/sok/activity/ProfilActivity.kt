package com.apps.sok.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.apps.sok.MainActivity
import com.apps.sok.R
import java.lang.StringBuilder

class ProfilActivity : AppCompatActivity() {

    lateinit var imageView_data : ImageView
    lateinit var data : ConstraintLayout
    lateinit var otmena : TextView
    lateinit var ok : TextView
    lateinit var saxranit : TextView
    lateinit var otmena_main : TextView
    lateinit var image_view_back : ImageView
    lateinit var editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        window.statusBarColor = resources.getColor(R.color.blue)


        imageView_data = findViewById(R.id.imageView_data)
        data = findViewById(R.id.data)
        otmena = findViewById(R.id.otmena)
        ok = findViewById(R.id.ok)
        saxranit = findViewById(R.id.saxranit)
        image_view_back = findViewById(R.id.backProf)
        otmena_main = findViewById(R.id.otmena_main)
        imageView_data.setOnClickListener {
            data.visibility = View.VISIBLE
        }
        otmena.setOnClickListener {
            data.visibility = View.GONE
        }
        ok.setOnClickListener {
            data.visibility = View.GONE
        }
        data.setOnClickListener {
            data.visibility = View.GONE
        }
        saxranit.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })
        image_view_back.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })
        otmena_main.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
            finish()
        })

        editText = findViewById<EditText>(R.id.phone)
        editText.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // TODO Auto-generated method stub
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // TODO Auto-generated method stub
            }

            override fun afterTextChanged(s: Editable) {
                val text: String = editText.getText().toString()
                val textLength: Int = editText.getText().length
                if (text.endsWith("-") || text.endsWith(" ") || text.endsWith(" ")) return
                if (textLength == 1) {
                    if (!text.contains("(")) {
                        editText.setText(StringBuilder(text).insert(text.length - 1, "+7 (").toString())
                        editText.setSelection(editText.getText().length)
                    }
                } else if (textLength == 8) {
                    if (!text.contains(")")) {
                        editText.setText(StringBuilder(text).insert(text.length - 1, ") ").toString())
                        editText.setSelection(editText.getText().length)
                    }
                } else if (textLength == 13) {
                    editText.setText(StringBuilder(text).insert(text.length - 1, "-").toString())
                    editText.setSelection(editText.getText().length)
                } else if (textLength == 14) {
                    if (!text.contains("-")) {
                        editText.setText(StringBuilder(text).insert(text.length - 1, "-").toString())
                        editText.setSelection(editText.getText().length)
                    }
                } else if (textLength == 16) {
                    editText.setText(StringBuilder(text).insert(text.length - 1, "-").toString())
                    editText.setSelection(editText.getText().length)
                }
            }
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