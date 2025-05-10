package com.example.sumcalc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val editText1: EditText = findViewById(R.id.editText1)
        val editText2: EditText = findViewById(R.id.editText2)

        try {
            val result = editText1.text.toString().toDouble() + editText2.text.toString().toDouble()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Result", result)
            startActivity(intent)
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Неверный ввод", Toast.LENGTH_SHORT).show()
        }
    }
}