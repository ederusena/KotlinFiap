package Colecoes

fun main(args: Array<String>) {
    var cidades = arrayOf<String>("São Paulo", "Rio de Janeiro", "Curitiba")

    println(cidades[1])
    println(cidades[2])

    cidades[2] = "Florianopolis"

    println(cidades[2])

    var temCidade = cidades.isEmpty()

    println(temCidade)

    println(cidades.size)

}