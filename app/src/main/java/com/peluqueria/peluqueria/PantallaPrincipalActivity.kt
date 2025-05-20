package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Actividad que representa la pantalla principal al abrir la aplicación
class PantallaPrincipalActivity : AppCompatActivity() {

    // Método que se ejecuta cuando se crea la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asocia el diseño XML correspondiente a esta actividad
        setContentView(R.layout.activity_pantalla_principal)

        // Obtiene las referencias de los botones desde el layout
        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val btnRegistrarse = findViewById<Button>(R.id.btnRegistrarse)

        // Acción al hacer clic en el botón de "Iniciar Sesión"
        btnIniciarSesion.setOnClickListener {
            // Crea un Intent para abrir la actividad de inicio de sesión
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)  // Lanza la nueva actividad
        }

        // Acción al hacer clic en el botón de "Registrarse"
        btnRegistrarse.setOnClickListener {
            // Crea un Intent para abrir la actividad de registro de usuario
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)  // Lanza la nueva actividad
        }
    }
}
