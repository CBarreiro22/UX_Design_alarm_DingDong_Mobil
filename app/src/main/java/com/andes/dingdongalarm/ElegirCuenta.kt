package com.andes.dingdongalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ElegirCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.elegir_cuenta)
        val usuario = findViewById<ImageButton>(R.id.usuario)
        usuario.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }
    }
}