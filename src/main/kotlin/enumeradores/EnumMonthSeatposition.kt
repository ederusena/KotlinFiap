package enumeradores

//Enum que define as posições das poltronas em um avião
//Veja que é possível atribuir um valor padrão a cada uma delas
enum class SeatPosition(var seat: String) {
    aisle("corredor"),
    middle("meio"),
    window("janela")
}
//Enum de Int com valores padrões
enum class Month(var m: Int) {
    january(1), february(2), march(3), april(4), may(5), june(6),
    july(7), august(8), september(9), october(10), november(11), december(12)
}
fun main(args: Array<String>) {
    var passengerSeat = SeatPosition.window
    //Para imprimir o valor padrão, usamos o nome utilizado na construção do enum. Veja:
    println(passengerSeat.seat)   //janela
    var currentMonth: Month = Month.june
    println("Estamos no mês ${currentMonth.m} do ano")
}