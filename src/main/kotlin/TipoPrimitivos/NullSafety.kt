package TipoPrimitivos

fun main(args: Array<String>) {
    //A linha abaixo o código não vai compilar
    //var driverLicense: String = null

    // A atribuição de null a um var também não será compilada
    //var driverLicense: String = "6789877"
    //driverLicense = null // não compila
    // Para que uma variável contenha um valor null é necessário
    // o uso do sufixo ? no tipo
    var driverLicense: String? = null
    println(driverLicense)
    driverLicense = "6789877"
    println(driverLicense)
    driverLicense = null // agora compila
    println(driverLicense)

    var driverLicense2: String? = null
    // driverLicense2 = "6789877"
    if (driverLicense2 != null) {
        println("A carteira de motorista é $driverLicense2")
    } else {
        println("Esta pessoa não possui carteira de motorista")
    }
    //Resultado: Esta pessoa não possui carteira de motorista
}