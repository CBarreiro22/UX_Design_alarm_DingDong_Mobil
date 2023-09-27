package com.andes.dingdongalarm

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.NumberPicker
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NuevaAlarma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_alarma)

        val grupoAlarmaItems = listOf("Reproducir música", "Enviar mensaje", "Realizar llamada")
        val sonidoItems = listOf("Campana", "Policia", "Bosque")
        val spinnerGrupoAlarma = findViewById<Spinner>(R.id.spinner)
        val spinnerSonido= findViewById<Spinner>(R.id.sonido)

        val adapterGrupoAlarmas = ArrayAdapter(this, android.R.layout.simple_spinner_item, grupoAlarmaItems)
        adapterGrupoAlarmas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGrupoAlarma.adapter = adapterGrupoAlarmas

        val adapterSonidos = ArrayAdapter(this, android.R.layout.simple_spinner_item, sonidoItems)
        adapterSonidos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSonido.adapter = adapterSonidos

        spinnerGrupoAlarma.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = grupoAlarmaItems[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val cancelar = findViewById<TextView>(R.id.cancelar)
        cancelar.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }
        val guardar = findViewById<TextView>(R.id.guardar)
        guardar.setOnClickListener {
            val intent = Intent(this, Alarmas::class.java)
            startActivity(intent)
        }
        val acciones = findViewById<Button>(R.id.acciones)
        acciones.setOnClickListener {
            val intent = Intent(this, Acciones::class.java)
            startActivity(intent)
        }
        val hourPicker = findViewById<NumberPicker>(R.id.hourPicker);
        val minutePicker = findViewById<NumberPicker>(R.id.minutePicker);
        val amPmPicker = findViewById<NumberPicker>(R.id.amPmPicker)

        hourPicker.setMinValue(0);
        hourPicker.setMaxValue(12);
        minutePicker.setMinValue(0);
        minutePicker.setMaxValue(59);
        amPmPicker.minValue = 0
        amPmPicker.maxValue = 1
        amPmPicker.displayedValues = arrayOf("AM", "PM")
        hourPicker.setOnValueChangedListener { picker: NumberPicker?, oldVal: Int, newVal: Int -> }
        minutePicker.setOnValueChangedListener { picker: NumberPicker?, oldVal: Int, newVal: Int -> }


    }

}