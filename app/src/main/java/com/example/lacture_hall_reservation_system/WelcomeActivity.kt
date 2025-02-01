package com.example.lacture_hall_reservation_system

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val login_btn = findViewById<Button>(R.id.btnLogin)
        login_btn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val registration_btn = findViewById<Button>(R.id.btnRegister)
        registration_btn.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}