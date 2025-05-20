package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Actividad que gestiona el registro de nuevos usuarios
class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register) // Establece el layout para esta pantalla

        // Referencias a los campos de entrada y al botón
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        // Acción cuando el usuario presiona "Registrar"
        btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val correo = etCorreo.text.toString()
            val contrasena = etContrasena.text.toString()

            // Validar que todos los campos estén llenos
            if (nombre.isNotEmpty() && correo.isNotEmpty() && contrasena.isNotEmpty()) {
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

                // Ir a la pantalla de agendar cita
                val intent = Intent(this, AgendarCitaActivity::class.java)
                startActivity(intent)
                finish() // Cierra esta pantalla para evitar regresar con el botón "Atrás"
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
