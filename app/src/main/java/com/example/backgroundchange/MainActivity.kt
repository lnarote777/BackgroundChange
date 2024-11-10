package com.example.backgroundchange

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        val fondoEdit = findViewById<View>(R.id.fondo)

        var isBlue = false

        button.setOnClickListener {
            if(isBlue){
                fondoEdit.setBackgroundColor(Color.CYAN)
            }else{
                fondoEdit.setBackgroundColor(Color.BLUE)
            }
            isBlue = !isBlue
        }
    }
}