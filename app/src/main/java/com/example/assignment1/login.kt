package com.example.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.login_btn).setOnClickListener {
            startActivity(Intent(this, LoginDetail::class.java))
        }
        findViewById<TextView>(R.id.signup_text).setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}