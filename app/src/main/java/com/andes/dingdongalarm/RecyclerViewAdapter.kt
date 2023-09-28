package com.andes.dingdongalarm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val elementos = mutableListOf<String>()

    // Método para agregar elementos al adaptador
    fun agregarElemento(elemento: String) {
        elementos.add(elemento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Implementa la creación de ViewHolder según tus necesidades
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Implementa la asignación de datos al ViewHolder según tus necesidades
        holder.bind(elementos[position])
    }

    override fun getItemCount(): Int {
        return elementos.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Implementa la inicialización de elementos de vista en el ViewHolder
        val textView: TextView = itemView.findViewById(R.id.text_view)
        fun bind(elemento: String) {
            textView.text = elemento
            // Puedes configurar la imagen aquí si es necesario
        }
    }
}
