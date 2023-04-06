package com.example.cobamodul2no2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
    private fun init(){
        recyclerView = findViewById(R.id.recycler_view)
        var data = ArrayList<produk>()
        data.add(produk(R.drawable.americano,"americano", "americano Icon"))
        data.add(produk(R.drawable.cappucino,"cappucino", "cappucino Icon"))
        data.add(produk(R.drawable.espreso,"espreso", "espreso Icon"))
        data.add(produk(R.drawable.latte,"latte", "latte Icon"))
        data.add(produk(R.drawable.mocha,"mocha", "mocha Icon"))
        data.add(produk(R.drawable.americano,"americano", "americano Icon"))
        data.add(produk(R.drawable.cappucino,"cappucino", "cappucino Icon"))
        data.add(produk(R.drawable.espreso,"espreso", "espreso Icon"))
        data.add(produk(R.drawable.latte,"latte", "latte Icon"))
        data.add(produk(R.drawable.mocha,"mocha", "mocha Icon"))
        data.add(produk(R.drawable.americano,"americano", "americano Icon"))
        data.add(produk(R.drawable.cappucino,"cappucino", "cappucino Icon"))
        data.add(produk(R.drawable.espreso,"espreso", "espreso Icon"))
        data.add(produk(R.drawable.latte,"latte", "latte Icon"))
        data.add(produk(R.drawable.mocha,"mocha", "mocha Icon"))

        adapter = MyAdapter(data)
    }
}