package com.example.sharedpreferences

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity :AppCompatActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.layout_main)
       // setContentView(R.layout.layout_pesquisa)

        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtTelefone = findViewById<EditText>(R.id.edt_telefone)
        val btnGravar= findViewById<Button>(R.id.btn_gravar)
        val btnPesquisar = findViewById<Button>(R.id.btn_ler)
       // val btnVoltar = findViewById<Button>(R.id.btn_voltar)
        btnGravar.setOnClickListener {
            //salva o contato
            //usar o shared preferences
            Toast.makeText(this,"Salvo com sucesso", Toast.LENGTH_LONG).show()
        }
        btnPesquisar.setOnClickListener {
            //tela de contato

        }


    }
}