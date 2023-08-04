package operadores

fun main(args: Array<String>) {
    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        print(number)   //Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        print(number)   //Imprime de 1 a 9
    }
}