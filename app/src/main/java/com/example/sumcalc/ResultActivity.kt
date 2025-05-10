package com.example.sumcalc

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val intent: Intent = intent
        val result: Double = intent.getDoubleExtra("Result", 0.0)
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = result.toString()
    }
}