package com.example.pr18_19_titaeva

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // TODO Auto-generated method stub
        var intent: Intent? = null
        intent = when (item.itemId) {
            R.id.m1 -> Intent(this, history::class.java)
            R.id.m2 -> Intent(this, python::class.java)
            R.id.m3 -> Intent(this, java::class.java)
            R.id.m4 -> Intent(this, c::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}