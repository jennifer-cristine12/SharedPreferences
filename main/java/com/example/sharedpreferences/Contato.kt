package com.example.sharedpreferences

data class Contato(
    val id: Long = 0,
    var nome: String = "",
    var email: String = "@gmail.com",
    var telefone: Int = 0
)
