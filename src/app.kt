/**
 * Created by DEMG on 14/01/2017.
 */

fun main(args: Array<String>) {
    getValFunc()
}

fun getValFunc() {
    val resultadoSum = sumNumeros(5, 5)
    // Named Arguments en Kotlin
    val resultadoMult = multNumeros(x = 5, y = 5)
    // Funcion que utiliza valores por defecto
    val resultadoRest = restNumeros(x = 5)

    println("El resultado de suma es: $resultadoSum")
    println("El resultado de Multiplicacion es: $resultadoMult")
    println("El resultado de Resta es: $resultadoRest")
}

fun restNumeros(x: Int, y: Int = 0): Int {
    return x - y
}

// Esta forma de representar la funcion sirve solo cuando la expresion es de 1 sola linea
fun multNumeros(x: Int, y: Int): Int = x * y

fun sumNumeros(x: Int, y: Int): Int {
    return x + y
}

fun getCadenas() {
    var name = "David Mendez Guardado"
    var experience = 5
    println("Hola soy $name y soy desarrollador en Kotlin, Java, etc. desde hace $experience años.")
}

fun getVariables() {
    println("Hola Mundo")

    // De forma sencilla
    var a = 1
    // De forma explisita
    var aa: Int = 1

    // Declarar variable y luego asignarla
    var aaa: Int
    aaa = 3
    var b = 5
    b += 1

    // Constantes
    val bb = 5

    println(aaa + b)

}
