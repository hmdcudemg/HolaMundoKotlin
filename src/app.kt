/**
 * Created by DEMG on 14/01/2017.
 */

fun main(args: Array<String>) {
    getCadenas()
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
