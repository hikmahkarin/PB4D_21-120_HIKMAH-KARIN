package com.example.fragmen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*isi content*/
        val fragment = HomeFragment.newInstance("test1", "test2")
        val bottom_navigation_view = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottom_navigation_view.setOnNavigationItemSelectedListener(menuItemSelected)
        addFragment(fragment)
    }
    /*Deteksi menu item mana yang diklik*/
    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.id_home -> {
                val fragment = HomeFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.id_database -> {
                val fragment = databaseFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.id_setting -> {
                val fragment = settingFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    /*Memanggil Fragment ke frame_layout di activity main*/
    private fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            /*Untuk mengaktifkan animasi transisi antar pergantian fragment*/
            .setCustomAnimations(com.google.android.material.R.anim.design_bottom_sheet_slide_in, com.google.android.material.R.anim.design_bottom_sheet_slide_in)
            /*Untuk mengganti isi content dengan fragment tertentu*/
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_notification->Toast.makeText(this,"Kamu menekan notifikasi",Toast.LENGTH_LONG).show()
            /*R.id.menu_profile->Toast.makeText(this,"Kamu menekan profile",Toast.LENGTH_LONG).show()*/
            R.id.menu_profile -> {
                val fragment = ProfilFragment.newInstance("test1", "test2")
                addFragment(fragment)
                return true
            }
            R.id.menu_logout->finish()
        }
        return true
    }
}