package com.example.assignment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.login_btn).setOnClickListener {
            startActivity(Intent(this, login_detail::class.java))
        }
        findViewById<TextView>(R.id.signup_text).setOnClickListener {
            startActivity(Intent(this, register::class.java))
        }
    }
}