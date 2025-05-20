package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Actividad para la pantalla de inicio de sesión
class LoginActivity : AppCompatActivity() {

    // Método que se ejecuta al crear la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el layout asociado a esta actividad
        setContentView(R.layout.activity_login) // Asegúrate que este layout existe

        // Obtiene referencias a los botones de login y registro
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerButton = findViewById<Button>(R.id.registerButton)

        // Evento cuando se presiona el botón de login
        loginButton.setOnClickListener {
            // Aquí podrías agregar validación de usuario y contraseña
            // Por simplicidad, se va directamente a la actividad para agendar citas
            val intent = Intent(this, AgendarCitaActivity::class.java)
            startActivity(intent)  // Inicia la nueva actividad
            finish()               // Cierra esta actividad para que no se pueda volver con el botón atrás
        }

        // Evento cuando se presiona el botón de registrar nuevo usuario
        registerButton.setOnClickListener {
            // Abre la actividad para registrar un nuevo usuario
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
