package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Actividad principal de la aplicación
class MainActivity : AppCompatActivity() {

    // Método que se ejecuta al iniciar la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el diseño de la pantalla desde el archivo XML
        setContentView(R.layout.activity_main)

        // Obtiene referencias a los botones en el layout
        val btnLogin = findViewById<Button>(R.id.loginButton)
        val btnRegister = findViewById<Button>(R.id.registerButton)
        val btnAgendar = findViewById<Button>(R.id.btnAgendar)

        // Evento al hacer clic en el botón de iniciar sesión
        btnLogin.setOnClickListener {
            // Inicia la actividad de inicio de sesión
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // Evento al hacer clic en el botón de registrarse
        btnRegister.setOnClickListener {
            // Inicia la actividad de registro
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        // Evento al hacer clic en el botón de agendar cita directamente
        btnAgendar.setOnClickListener {
            // Inicia la actividad para agendar una cita
            startActivity(Intent(this, AgendarCitaActivity::class.java))
        }
    }
}

