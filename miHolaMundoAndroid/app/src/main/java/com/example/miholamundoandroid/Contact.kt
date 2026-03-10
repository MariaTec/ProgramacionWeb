package com.example.miholamundoandroid

data class Contact(
    val name: String,
    val age: Int,
    val phone: String,
    val realName: String?
    ): SafeInfo{
    override fun getInfo(): String {
        return "Nombre: $name | Edad: $age | Telefono: $phone" //Funcionamiento de String Template
    }
}