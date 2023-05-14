package com.example.modul4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment1()
        val fragment = supportFragmentManager.findFragmentByTag(Fragment1::class.java.simpleName)

        if(fragment !is Fragment1){
            supportFragmentManager.beginTransaction()
                .add(R.id.container,fragment1, Fragment1::class.java.simpleName)
                .commit()
        }
    }
}