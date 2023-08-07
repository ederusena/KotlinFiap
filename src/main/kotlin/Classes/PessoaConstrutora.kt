package Classes

import javafx.scene.chart.Chart

class PessoaConstrutora constructor(var name: String, var isMale: Boolean, var age: Int = 0) {

   // Propriedade computada
    val gender: String
       get() {
           if(isMale) return "Masculino"
           else return "Feminino"
       }
    fun speak(sentence: String) {
        if(age < 3) {
            println("Child")
        } else {
            println(sentence)
        }
    }

    fun introduce() = println("\nOlá, meu nome é $name e tenho $age anos de idade")
}