package estruturasCondicionais

fun main(args: Array<String>) {
    var number = 11
    if (number % 2 == 0) {
        println("Ele é par")
    } else {
        println("Ele é ímpar")
    }
    var temperature = 18
    var climate = ""
    if (temperature <= 0) {
        climate = "Muito frio"
    } else if (temperature < 14) {
        climate = "Frio"
    } else if (temperature < 21) {
        climate = "Clima agradável"
    } else if (temperature < 30) {
        climate = "Um pouco quente"
    } else {
        climate = "Muuuito quente"
    }
    println("Temperatura:$temperature graus Status:$climate")
}