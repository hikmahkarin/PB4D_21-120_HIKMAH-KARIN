package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_ex = findViewById<Button>(R.id.button_ex)
        val button_im = findViewById<Button>(R.id.button_im)

        button_ex.setOnClickListener{
            Intent(this, MainActivity2 ::class.java).also{
                startActivity(it)
            }
        }

        button_im.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }
    }
}