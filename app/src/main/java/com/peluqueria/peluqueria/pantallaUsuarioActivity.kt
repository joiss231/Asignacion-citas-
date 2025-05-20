package com.peluqueria.peluqueria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Actividad que representa la pantalla del usuario una vez ha iniciado sesión
class PantallaUsuarioActivity : AppCompatActivity() {

    // Método que se ejecuta al iniciar la actividad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asocia el layout XML a esta actividad
        setContentView(R.layout.activity_pantalla_usuario)

        // Obtiene la referencia al botón de cerrar sesión
        val btnCerrarSesion = findViewById<Button>(R.id.btnCerrarSesion)

        // Obtiene la referencia al botón para agendar una cita
        val btnAgendarCita = findViewById<Button>(R.id.btnAgendarCita)

        // Acción del botón "Cerrar sesión"
        btnCerrarSesion.setOnClickListener {
            // Muestra mensaje de confirmación
            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show()

            // Redirige al Login y elimina el historial de actividades para evitar volver atrás
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish() // Finaliza la actividad actual
        }

        // Acción del botón "Agendar cita"
        btnAgendarCita.setOnClickListener {
            // Aquí puedes implementar la lógica o redirección para agendar una cita
            Toast.makeText(this, "Aquí va la lógica para agendar cita", Toast.LENGTH_SHORT).show()

            // Ejemplo de redirección si tienes una pantalla de agendamiento
            // val intent = Intent(this, AgendarCitaActivity::class.java)
            // startActivity(intent)
        }
    }
}
