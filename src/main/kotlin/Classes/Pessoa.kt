package Classes

import java.time.LocalDate
import java.time.Period

open class Pessoa {
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 12, 24)
    var peso: Int = 0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }

    open fun imprime() {
        println("Nome ${nome}")
        println("Data Nascimento ${dataNascimento}")
        println("Peso: ${peso}")
        println("Altura:  ${altura}")
        println("idade: ${idade}")
    }

}
