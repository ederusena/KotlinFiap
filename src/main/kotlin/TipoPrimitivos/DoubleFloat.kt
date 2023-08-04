package TipoPrimitivos

fun main(args: Array<String>) {
    //Tipo Double é o tipo padrão para valores numéricos com casas decimais
    var balance = 1500.75           //Double inferido automaticamente
    var sallary: Double = 1200.50   //Double explícito
    //Para usarmos Float, precisamos adicionar a letra F maiúscula ou minúscula no final da informação
    var height = 1.82f
    var temperature: Float = 35.9F
    //Apresentando as informações
    println(balance)
    println(sallary)
    println(height)
    println(temperature)


}
