package funcoes

fun main(args: Array<String>) {
    somar(2,4)
    somar(valor1 = 2,valor2 = 9)

    println(subtrair(2,1))
    println(dividir(10,2))
}

fun somar(valor1: Int, valor2: Int) {
    println("A soma é ${valor1 + valor2}")
}

fun subtrair(valor1: Int, valor2: Int): Int {
    return valor1 + valor2
}

fun dividir(valor1: Int, valor2: Int) = valor1 / valor2