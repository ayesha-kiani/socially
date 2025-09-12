package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityFollowing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_following)
        findViewById<ImageView>(R.id.You).setOnClickListener {
            startActivity(Intent(this, You::class.java))
        }
        findViewById<ImageView>(R.id.following).setOnClickListener {
            startActivity(Intent(this, ActivityFollowing::class.java))
        }
    }
}