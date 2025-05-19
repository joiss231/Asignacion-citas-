package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PantallaUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_usuario)

        val btnCerrarSesion = findViewById<Button>(R.id.btnCerrarSesion)
        val btnAgendarCita = findViewById<Button>(R.id.btnAgendarCita)

        // Acción del botón "Cerrar sesión"
        btnCerrarSesion.setOnClickListener {
            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        // Acción del botón "Agendar cita"
        btnAgendarCita.setOnClickListener {
            // Aquí puedes redirigir a la pantalla de agendamiento (si ya la tienes)
            Toast.makeText(this, "Aquí va la lógica para agendar cita", Toast.LENGTH_SHORT).show()
        }
    }
}
