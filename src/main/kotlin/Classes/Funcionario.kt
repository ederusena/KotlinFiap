package Classes

class Funcionario: Pessoa() {
    var cargo: String = ""

    override fun imprime() {
        println("Nome ${nome}")
        println("Data Nascimento ${dataNascimento}")
        println("Peso: ${peso}")
        println("Altura:  ${altura}")
        println("idade: ${idade}")
        println("Cargo: ${cargo}")
    }
}