/**
 * Created by DEMG on 14/01/2017.
 */

fun main(args: Array<String>) {
    getNullables()
}

fun getNullables() {
    // El error del millon de dolares NullPointerException

    var a: String? = "Windows" // este siempre sera un string con valor no acepta nulos
    var b: String? = "Microsoft" // este string si puede tener valores nulos
    var c: String? = "Apple"

    b = null
    a = null
    //c = null

    var d = a?.length
    println(d)

    var e = if (b == null) 0 else b.length // opcion recomendada en mayoria de los casos
    println("La longitud de caracteres de b es: $e")

    var f: Int = c!!.length // opcion menos recomendadas ya que puede mandar NullPointerException, asegurarse de que el valor no sea nulo
    println("La longitud en caracteres de c es: $f")
}

fun getCiclos() {
    var array: Array<String> = arrayOf("1", "2", "3", "4", "5")
    println("For sencillo")
    for (i in array.indices) {
        println("El elemento en la posicion $i es: ${array[i]}")
    }
    println("For expecifico")
    for ((indices, valor) in array.withIndex()) {
        println("El elemento en la posicion $indices es: $valor")
    }
    println("While")
    var i = 0
    while (i < array.size) {
        println("El valor en $i es: ${array[i]}")
        i++
    }
}

fun getArreglos() {
    var array: Array<String> = arrayOf("1", "2", "3", "4", "5")

    println(array.get(0))
    println(array[1])

    var arraySolo = kotlin.arrayOfNulls<String>(10)
    arraySolo.set(0, "Uno")
    println(arraySolo.get(0))
}

// "Unit" sirve para las funciones en java y otros lenguajes seria void.
fun valorJusto(valor: Int): Unit {

    when (valor) {
        1 -> println("Opcion 1 del menu")
        2 -> println("Opcion 2 del menu")
        in 3..5 -> println("Opcion entre 3 y 5")
        else -> println("Opcion no encontrada")
    }

}

fun getMax(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
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
