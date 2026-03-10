package com.example.miholamundoandroid


const val APP_VERSION = "1.0"
fun main(){
    menu()
}

fun menu() {
    println("--Bienvenida a mis contactos v$APP_VERSION--") //Uso de string template
    val contacts = mutableListOf<Contact>()

    while (true) {
        print("""
            Ingrese un digito para seleccionar una opcion:
            1. Agregar Contactos.
            2. Ir a Concactos.
            3. Buscar Contactos.
            4. Salir
        """)
        val option = readln().toIntOrNull()
        when(option){
            1 -> {
               addContact(contacts)
            }
            2 ->{
                listContacts(contacts)
            }
            3 ->{
                searchContacts(contacts)
            }
            4 ->{
                println("¡Hasta pronto!")
                return
            }
            else -> {
                println("||Opcion Invalida||")
            }
        }
    }
}

fun searchContacts(contacts: MutableList<Contact>){
    println("Buscar por nombre: ")
    val name = readln()
    val found = contacts.find { it.name.equals( other = name, ignoreCase = true)}

    if (found == null){
        println("No se encuentro el contacto: ")
    }
    else {
        println("Contacto encontrado: \n${found.getInfo()}")
    }

}

fun listContacts(contacts: MutableList<Contact>) {
    if (contacts.isEmpty()){
        println("No hay contactos registrados :( ")
    }  else {
        println("Lista de contactos:")
        contacts.forEach {
            println(it.getInfo())
        }
    }
}



fun addContact(contacts: MutableList<Contact>) {
    println("Ingres el nombre: ")
    val name = readln()

    println("Ingrese la edad: ")
    val age = readln().toIntOrNull() ?: 0


    if (age <= 0){
        println("||Edad no valida||")
        return
    }

    println("Ingrese el telefono: ")
    val phone = readln()

    println("Ingrese el nombre real (opcion, enter para omitir)")
    val realName = readln().ifBlank { null }

    contacts += Contact(name, age, phone, realName)
    println("||Contactos agregados||")
}
