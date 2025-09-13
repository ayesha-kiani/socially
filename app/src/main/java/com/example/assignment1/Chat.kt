package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        findViewById<ImageView>(R.id.call).setOnClickListener {
            startActivity(Intent(this, Call::class.java))
        }
        findViewById<ImageView>(R.id.chat_camera).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }
        findViewById<ImageView>(R.id.back_arrow).setOnClickListener {
            startActivity(Intent(this, DMs::class.java))
        }
    }
}