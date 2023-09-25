package com.andes.dingdongalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val googleButton = findViewById<ImageButton>(R.id.GoogleButton)
        googleButton.setOnClickListener {
            val intent = Intent(this, ElegirCuenta::class.java)
            startActivity(intent)
        }
    }
}