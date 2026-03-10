package com.example.miholamundoandroid

fun main(){
    //println("Hola, mundo")
   // println("Hola, kotlin")
    //funciones()
    //varAndString()
    //numeros()
    //constants()
    //nulls()
    //lists()
    //sentences()
    //returns()
    //dataClass()
    //interfaces()
    whenAndMutableList()


}

fun whenAndMutableList() {
    println("Sentencia when y lista mutable")
    val names = mutableListOf("Alondra", "Mex", "Maria")
    println(names)
    names.add("Alvin")
    println(names)

    //uso del when para un pequeño menu
    println("ingresa un numero (1-Añadir, 2-limpiar Lista)")
    val option = readln().toIntOrNull()
    when(option){
        1 -> {
            names.add("Presuel")

        }
        2 -> {
            names.clear()
            //println(names)
        }
        else -> {
            println("Accion invalida")
            return
        }
    }
    println("Lista actualizada; $names")
}

/*fun interfaces() {
    println("Interfaces")
    val contact: SafeInfo = Contact("MariaRamos1", 22,"986756892", "Maria Ramos")
    println(contact.getInfo())
}*/

/*fun dataClass() {
    println("Clases (modelo de datos, entidad u objetos)") //otra forma de referirse a las clases
    val contact: Contact = Contact("AlvinSal", 27, "9812242350", "Maria Ramos") //lo que se realizo fue una instancia para una clase para considerarlo un objeto
    println(contact) //data class convierte u optimiza la clase en un modelo de datos (muestra toda la informacion del objeto contacto), se puede acceder a las propiedades sin conviertilo en data class: contact.phone
    println(contact.phone)
    println(contact.realName)
}*/

fun returns() {
    println("retornos")
    val name = collectNmae()
    println(name)
}

fun collectNmae(): String{
    println("Ingresa un nombre")
    val name = readln()
    if (name.isNotEmpty()){
        return name
    }else {
        return "no se ingreso un nombre"
    }
    //return "Prueba Retorno"
}

fun sentences() {
    println("sentencias if y while")

    println("ingresa un nombre: ")
    val name = readln()

    if (name.isNotEmpty()){
        println(name)
    }else {
        println("No se ingreso un nombre")
    }

    var counter = 1
    var result = 0
    while (counter <= 2 ){
        println("ingrese un numero para sumar: ")
        val number = readln().toInt()
        result += number
        counter++

    }
    println(result)
}

fun lists() {
    println("listas y sus metodos")
    val name1 = "Pedro"
    val name2 = "Alejandro"
    println(name1)
    println(name2)
    //listas o colecciones de datos
    val names = listOf("Maria", "Alondra", "Alejandro")
    println(names)

    names.forEach{
        println(it) //it es el elemento actual, por cada uno de los elementos y se imprimen por cada referencia de cada elemento
    }

    val name = readln()
    val search = names.find { it == name } // recore tofos los elementos hasta encontrar una referencia
    println(search)
    val searchAdvance = names.find { it.equals(other = name, ignoreCase = true) } //para variables de tipo string, ignora las mayusculas y minisculas
    println(searchAdvance)
}

fun nulls() {
    println("valores nulos")
    var name: String = "Alondra"
    var nullName: String? = "Maria" // nulo es un valor invalido
    println(name)
    println(nullName)
    nullName = null
    println(nullName)
}

var año = 2026 //este se puede modificar || GLOBALES pueden ser accesibles para cualquier otra funcion
const val dia = "viernes" // este se puede odificar
fun constants() {
    println("constantes")
    val name = readln() //una contante no perdimte datos luego de su consolacion
    println(name)
    println(dia) //Variable local, se ocupa unicamente en la misma funcion donde fue declarada
    println(año)
    año = 2028
    println(año)
}

fun numeros() {
    println("numeros")
    var edad = 23
    println(edad)
    edad = 20 * 2
    println(edad)
    edad = 20 / 2
    println(edad)
    edad = 20 - 2
    println(edad)
    edad = 20 + 2
    println(edad)

    edad = edad + 2
    println(edad)
    edad += 2
    println(edad)

    edad++
    println(edad)
    edad--
    println(edad)
}

fun funciones(){
    println("Mi primera funion en kotlin")
    println("Hola, kotlin")
}

fun varAndString(){
    println("variables y texto string")
    var name1: String = "Alondra" //de tipo string
    var name2 = "Guadalupe" //tipo string

    println(name1)
    println(name2)

    name2 = "Maria"
    println(name2)

    var textoLibre = """""Alondra Ramos"""

    name2 = "Alejandro \nmex"
    println(name2)

    textoLibre = """Alondra \nRamos"""
    println((textoLibre))
    }