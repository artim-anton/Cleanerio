package com.artimanton.cleanerio

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    var isChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView: LottieAnimationView = findViewById(R.id.lottieAnimationView)

        animationView.setOnClickListener {
           Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
        }



        if (animationView.isAnimating) {
            // Do something.
        }
    }
}