package TipoPrimitivos

fun main(args: Array<String>) {
    var module: String = "Introdução ao Kotlin"
    var schoolName = "FIAP"
    //Note que letter, na linha abaixo, é uma String
    //Devido à inferência de tipo
    var letter = "A"
    //Para usarmos Char, precisamos definir explicitamente
    var gender: Char = 'M'

    // Apresentando os valores
    println(module)
    println(schoolName)
    println(letter)

    // Para apresentação de valores Char é necessária a conversão para String
    //Utilize o caracter $ para a saída. Explicaremos o uso do $ nas próximas páginas
    println("$gender")
}
