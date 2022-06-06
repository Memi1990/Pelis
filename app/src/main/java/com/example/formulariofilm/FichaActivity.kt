package com.example.formulariofilm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.formulariofilm.databinding.ActivityFichaBinding
import com.example.formulariofilm.databinding.ActivityMainBinding

class FichaActivity : AppCompatActivity() {
    private lateinit var b: ActivityFichaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityFichaBinding.inflate(layoutInflater)
        setContentView(b.root)
        val datos = intent.extras

        val str = """   DATOS
            Título: ${datos?.get("TITULO")}
            Año: ${datos?.get("YEAR")}
            Tipo: ${datos?.get("TIPO")}
            Categorías: ${datos?.get("CATEGORIA")}
        """.trimIndent()
        b.tvDatos.text = str

        b.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}