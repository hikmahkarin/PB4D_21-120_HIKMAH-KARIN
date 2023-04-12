package com.example.modul3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button_kembali = findViewById<Button>(R.id.button_kembali)

        button_kembali.setOnClickListener{
            Intent(this, MainActivity ::class.java).also{
                startActivity(it)
            }
        }
    }

}