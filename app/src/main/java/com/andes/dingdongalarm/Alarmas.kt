package com.andes.dingdongalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner

class Alarmas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarmas)

        // Paso 2: Crear una lista de elementos para el Spinner
        val elementos = listOf(" ","Trabajo", "Casa", "Medicamento", "Pasatiempo")

        // Paso 3: Configurar el Spinner y el adaptador
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, elementos)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador

        // Paso 4: Manejar la selección del Spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Aquí puedes manejar la selección del elemento
                val selectedItem = elementos[position]
                // Haz lo que necesites con el elemento seleccionado
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Acción cuando no se selecciona nada (si es necesario)
            }
        }
        val agregarAlarmaButton = findViewById<Button>(R.id.button)
        agregarAlarmaButton.setOnClickListener {
            val intent = Intent(this, NuevaAlarma::class.java)
            startActivity(intent)
        }
    }
}