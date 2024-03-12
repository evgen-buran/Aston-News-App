package com.buranchikov.astonnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buranchikov.astonnewsapp.databinding.ActivityMainBinding
import com.buranchikov.astonnewsapp.splashscreen.SplashScreenFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
    val splashScreenFragment = SplashScreenFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, splashScreenFragment).commit()
    }
}