package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Post : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        findViewById<TextView>(R.id.cancel).setOnClickListener {
            finish()
        }
        findViewById<TextView>(R.id.next).setOnClickListener {
            finish()
        }
    }
}