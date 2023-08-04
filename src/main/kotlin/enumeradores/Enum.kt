package enumeradores

//Definindo um enum fora da função main
enum class Compass {
    north,
    east,
    west,
    south
}
fun main(args: Array<String>) {
    //Criando uma variável do tipo Compass
    var direction = Compass.north
    //Como Kotlin trabalha com inferência de tipo, podemos usar
    // somente .valor, caso o tipo seja definido explicitamente
    var direction2: Compass = Compass.south
    println("Minha direção é $direction")
    //Minha direção é north
    //Enums são muito usados com switch para análise do valor
    when (direction) {
        Compass.north ->
            println("Estamos indo para o norte")
        Compass.south ->
            println("Estamos indo para o sul")
        Compass.east ->
            println("Estamos indo para o leste")
        Compass.west ->
            println("Estamos indo para o oeste")
    }
    //Estamos indo para o norte

    //Outra forma de apresentar informações de um Enum
    Compass.values().forEach {
        println(it)
    }
}