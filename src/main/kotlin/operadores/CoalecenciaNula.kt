package operadores

fun main(args: Array<String>) {
    var age: Int? = null
    var myAge = age ?: 0    //0
    println(myAge)

    age = 25
    var newAge = age ?: 0   //25
    println(newAge)
}