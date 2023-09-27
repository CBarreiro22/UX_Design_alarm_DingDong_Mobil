package com.andes.dingdongalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class Acciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acciones)

        val accionesItems = listOf("Reproducir música", "Enviar mensaje", "Realizar llamada")
        val spinner = findViewById<Spinner>(R.id.accionesSpinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, accionesItems)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = accionesItems[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val cancelar = findViewById<TextView>(R.id.cancelar)
        cancelar.setOnClickListener {
            val intent = Intent(this, NuevaAlarma::class.java)
            startActivity(intent)
        }
        val guardar = findViewById<TextView>(R.id.guardar)
        guardar.setOnClickListener {
            val intent = Intent(this, NuevaAlarma::class.java)
            startActivity(intent)
        }
    }
}