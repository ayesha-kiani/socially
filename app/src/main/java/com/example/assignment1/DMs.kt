package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DMs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dms)
        findViewById<LinearLayout>(R.id.chat1).setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        findViewById<LinearLayout>(R.id.chat2).setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        findViewById<LinearLayout>(R.id.chat3).setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        findViewById<ImageView>(R.id.bottom_camera).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }
        findViewById<ImageView>(R.id.back_arrow).setOnClickListener {
            finish()
        }
        findViewById<ImageView>(R.id.camera_chat1).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }
        findViewById<ImageView>(R.id.camera_chat2).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }
        findViewById<ImageView>(R.id.camera_chat3).setOnClickListener {
            startActivity(Intent(this, TakePicture::class.java))
        }
    }
}