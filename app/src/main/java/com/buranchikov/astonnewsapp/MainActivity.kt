package com.buranchikov.astonnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.buranchikov.astonnewsapp.databinding.ActivityMainBinding
import com.buranchikov.astonnewsapp.splashscreen.SplashScreenFragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.materialToolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.toolbar_search ->Toast.makeText(this, "search", Toast.LENGTH_SHORT).show()
            R.id.toolbar_filter ->Toast.makeText(this, "filter", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onStart() {
        super.onStart()

    }
}