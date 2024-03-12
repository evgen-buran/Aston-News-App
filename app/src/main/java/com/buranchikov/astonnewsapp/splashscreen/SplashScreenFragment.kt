package com.buranchikov.astonnewsapp.splashscreen

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.buranchikov.astonnewsapp.MainActivity
import com.buranchikov.astonnewsapp.R
import com.buranchikov.astonnewsapp.databinding.ActivityMainBinding
import com.buranchikov.astonnewsapp.databinding.FragmentSplashScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
            playAnimation()
            addAnimatorListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator) {
                }

                override fun onAnimationEnd(p0: Animator) {
                    startActivity(Intent(requireActivity(), MainActivity::class.java))
                    CoroutineScope(Dispatchers.Main).launch {
                        delay(2000)
                        requireActivity().finish()
                    }

                }

                override fun onAnimationCancel(p0: Animator) {
                }

                override fun onAnimationRepeat(p0: Animator) {
                }
            })
        }
    }
}