package com.example.cadastro_aluno

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val nomeAlunoTextView = findViewById<TextView>(R.id.nomeAlunoTextView)
        val gerarMatriculaButton = findViewById<Button>(R.id.gerarMatriculaButton)
        val matriculaTextView = findViewById<TextView>(R.id.matriculaTextView)

        val nomeAluno = intent.getStringExtra("nomeAluno")
        nomeAlunoTextView.text = "Nome: $nomeAluno"

        gerarMatriculaButton.setOnClickListener {
            val numeroMatricula = (1000..9999).random()
            matriculaTextView.text = "Número de Matrícula: $numeroMatricula"
        }
    }
}