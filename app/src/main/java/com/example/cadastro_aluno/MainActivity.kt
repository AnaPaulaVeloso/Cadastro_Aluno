package com.example.cadastro_aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeAlunoEditText = findViewById<EditText>(R.id.nomeAlunoEditText)
        val proximoButton = findViewById<Button>(R.id.proximoButton)

        proximoButton.setOnClickListener {
            val nomeAluno = nomeAlunoEditText.text.toString().trim()

            if (nomeAluno.isNotEmpty()) {
                val intent = Intent(this, SegundaActivity::class.java)
                intent.putExtra("nomeAluno", nomeAluno)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, insira o nome do aluno", Toast.LENGTH_SHORT).show()
            }
        }
    }
}