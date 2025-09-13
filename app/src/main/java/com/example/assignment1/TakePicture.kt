package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TakePicture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_picture)
        findViewById<ImageView>(R.id.takepicture).setOnClickListener {
            startActivity(Intent(this, Poststory::class.java))
        }
        findViewById<ImageView>(R.id.chevron).setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
        }
    }
}