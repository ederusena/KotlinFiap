import Classes.Funcionario
import Classes.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {
    var pessoa: Pessoa = Pessoa()
    pessoa.nome = "Eder Sena"
    pessoa.altura = 1.77
    pessoa.peso = 122
    pessoa.dataNascimento = LocalDate.of(2021,12,2)


    // pessoa.imprime()
    var funcionario: Funcionario = Funcionario()
    funcionario.cargo = "Desenvolvedor"
    funcionario.nome = "Luffy"
    funcionario.altura = 1.24
    funcionario.peso = 89
    funcionario.dataNascimento = LocalDate.of(1987, 5, 24)

    funcionario.imprime()

}