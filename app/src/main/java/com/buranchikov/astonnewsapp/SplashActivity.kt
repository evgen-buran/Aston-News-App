package com.buranchikov.astonnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buranchikov.astonnewsapp.databinding.ActivitySplashBinding
import com.buranchikov.astonnewsapp.splashscreen.SplashScreenFragment

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .replace(R.id.splashContainer, SplashScreenFragment())
            .commit()
    }
}