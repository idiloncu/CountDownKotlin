package com.example.countdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                //her sanıyede/tikde ne yapacak
                binding.textView.text="Left:${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                //bittiğinde ne yapacak
                binding.textView.text="Left:0"

            }

        }.start()
    }
}