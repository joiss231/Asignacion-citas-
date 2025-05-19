package com.peluqueria.peluqueria

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgendarCitaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendar_cita)

        val etFecha = findViewById<EditText>(R.id.etFecha)
        val etHora = findViewById<EditText>(R.id.etHora)
        val etDescripcion = findViewById<EditText>(R.id.etEstilista)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnConfirmar.setOnClickListener {
            val fecha = etFecha.text.toString()
            val hora = etHora.text.toString()
            val descripcion = etDescripcion.text.toString()

            if (fecha.isNotEmpty() && hora.isNotEmpty() && descripcion.isNotEmpty()) {
                Toast.makeText(this, "Cita agendada exitosamente", Toast.LENGTH_SHORT).show()
                // Aquí puedes agregar la lógica para guardar la cita en base de datos
                finish()  // Cierra la actividad para volver a la anterior
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
