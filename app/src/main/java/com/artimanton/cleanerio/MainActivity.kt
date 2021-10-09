package com.artimanton.cleanerio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import io.reactivex.rxjava3.core.Observable

class MainActivity : AppCompatActivity() {
    var isChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView: LottieAnimationView = findViewById(R.id.lottieAnimationView)

        animationView.setOnClickListener {
            //val intent = Intent(this, HomeActivity::class.java)
            //startActivity(intent)
            Observable.just("Hello, RxKotlin")
                .subscribe{
                    Toast.makeText(this,it,Toast.LENGTH_LONG).show()
                }
        }





        if (animationView.isAnimating) {
            // Do something.
        }
    }
}