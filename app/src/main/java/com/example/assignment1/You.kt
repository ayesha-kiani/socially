package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class You : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_you)

        findViewById<ImageView>(R.id.nav_profile).setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }
        findViewById<ImageView>(R.id.nav_search).setOnClickListener {
            startActivity(Intent(this, Explorepage::class.java))
        }
        findViewById<ImageView>(R.id.nav_add).setOnClickListener {
            startActivity(Intent(this, Post::class.java))
        }
        findViewById<ImageView>(R.id.nav_home).setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
        }

        findViewById<Button>(R.id.msg_button1).setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        findViewById<Button>(R.id.msg_button2).setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }

    }
}