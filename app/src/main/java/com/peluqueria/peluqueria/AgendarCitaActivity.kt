package com.peluqueria.peluqueria

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Actividad para agendar una cita en la peluquería
class AgendarCitaActivity : AppCompatActivity() {

    // Método que se ejecuta al crear la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asocia el layout XML con esta actividad
        setContentView(R.layout.activity_agendar_cita)

        // Obtiene referencias a los campos de texto y botón en la interfaz
        val etFecha = findViewById<EditText>(R.id.etFecha)
        val etHora = findViewById<EditText>(R.id.etHora)
        val etDescripcion = findViewById<EditText>(R.id.etEstilista)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        // Define lo que ocurre cuando se presiona el botón "Confirmar"
        btnConfirmar.setOnClickListener {
            // Obtiene el texto ingresado en cada campo
            val fecha = etFecha.text.toString()
            val hora = etHora.text.toString()
            val descripcion = etDescripcion.text.toString()

            // Verifica que ningún campo esté vacío
            if (fecha.isNotEmpty() && hora.isNotEmpty() && descripcion.isNotEmpty()) {
                // Muestra un mensaje indicando que la cita fue agendada con éxito
                Toast.makeText(this, "Cita agendada exitosamente", Toast.LENGTH_SHORT).show()
                // Aquí puedes agregar la lógica para guardar la cita en base de datos
                finish()  // Cierra esta actividad y vuelve a la anterior
            } else {
                // Muestra un mensaje solicitando que se completen todos los campos
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
