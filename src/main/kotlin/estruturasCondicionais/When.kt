package estruturasCondicionais

fun main(args: Array<String>) {
    var number = 7
    when (number % 2) {
        0 ->
            println("$number é par")
        else ->
            println("$number é ímpar")
    }
//Exemplo com vários cenários no mesmo case
    var letter = "z"
    when (letter) {
        "a", "e", "i", "o", "u" ->
            println("vogal")
        else ->
            println("consoante")
    }
//Exemplo com range de letras
    when (letter) {
        in "a".."f" ->
            println("Você está na turma 1")
        in "g".."l" ->
            println("Você está na turma 2")
        in "m".."r" ->
            println("Você está na turma 3")
        else ->
            println("Você está na turma 4")
    }
//Range de números
    var speed = 33
    when (speed) {
        in 0 until 20 ->
            println("Primeira marcha")
        in 20 until 40 ->
            println("Segunda marcha")
        in 40 until 50 ->
            println("Terceira marcha")
        in 50 until 90 ->
            println("Quarta marcha")
        else ->
            println("Quinta marcha")
    }
}