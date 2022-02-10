package com.example.behran.customviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val happyButton = findViewById<EmotionalFaceView>(R.id.happyButton)
        val sadButton = findViewById<EmotionalFaceView>(R.id.sadButton)
        val emotionalFaceView = findViewById<EmotionalFaceView>(R.id.emotionalFaceView)
        happyButton.setOnClickListener{
           emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        }
        sadButton.setOnClickListener{
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
        }
    }
}