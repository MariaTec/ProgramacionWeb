package com.exampl.miprimerandroid01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimerandroid01.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val interfaz1 = findViewById<View>(R.id.interfaz1)
        val interfaz2 = findViewById<View>(R.id.interfaz2)
        val interfaz3 = findViewById<View>(R.id.interfaz3)
        val interfaz4 = findViewById<View>(R.id.interfaz4)

        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)

        boton1.setOnClickListener {
            interfaz1.visibility = View.GONE
            interfaz2.visibility = View.VISIBLE

        }

        boton2.setOnClickListener {
            interfaz2.visibility = View.GONE
            interfaz3.visibility = View.VISIBLE
        }

        boton3.setOnClickListener {
            interfaz3.visibility = View.GONE
            interfaz4.visibility = View.VISIBLE
        }
    }
}