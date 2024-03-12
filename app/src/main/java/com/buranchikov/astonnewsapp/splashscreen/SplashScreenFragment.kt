package com.buranchikov.astonnewsapp.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.buranchikov.astonnewsapp.R
import com.buranchikov.astonnewsapp.databinding.ActivityMainBinding
import com.buranchikov.astonnewsapp.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {
    lateinit var binding: FragmentSplashScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.lotieSplashView.apply {
            setMinProgress(0f)
            setMaxProgress(0.6f)
            repeatCount = 1
            repeatMode = LottieDrawable.REVERSE
            playAnimation()
        }
    }
}