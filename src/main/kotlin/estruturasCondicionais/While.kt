package estruturasCondicionais

fun main(args: Array<String>) {
    //Usando: while
    var life = 10
    while (life > 0) {
        println("O jogador está com $life vidas")
        life = life - 1
    }

    println("\n")

//Usando: do while
    var tries = 0
    var diceNumber = 0
    do {
        tries += 1

        diceNumber = ((Math.random() * 6) + 1).toInt()

        println("Tentativa:$tries <-> Número Randomizado: $diceNumber")
    } while (diceNumber != 6)

    println("\nVocê tirou 6 após $tries tentativas")
}