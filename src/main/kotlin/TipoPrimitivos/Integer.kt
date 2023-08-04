package TipoPrimitivos

fun main(args: Array<String>) {
    var value1 = 500       //Aqui, a inferência é para Int
    var value2: Int = 500  //Declaração explícita
    // Apresentando o value1
    println(value1)
    // Apresentando o value2
    println(value2)

    //Forma de mostrar o valor máximo aceito pelo tipo
    println(Int.MAX_VALUE)
    //Forma de mostrar o valor mínimo aceito pelo tipo
    println(Int.MIN_VALUE)
}