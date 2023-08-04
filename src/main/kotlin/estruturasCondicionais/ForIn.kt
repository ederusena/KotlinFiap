package estruturasCondicionais

fun main(args: Array<String>){
//Percorrendo um Array
var students = arrayOf(
    "João Francisco",
    "Pedro Henrique",
    "Gustavo Oliveira",
    "Janaina Santos",
    "Francisco José"
)
for (student in students) {
    println("O aluno $student veio na aula de hoje!")
}
//Percorrendo uma sequência (range)
for (day in 1..30) {
    println("Estou no dia $day")
}
//Note abaixo que uma String também é uma coleção
var name = "FIAP"
for (letter in name) {
    println(letter)
}
//Vejamos como percorrer uma coleção,
//imprimindo sua chave e valor. Nesta coleção
//a chave é String e o valor é Int
var people = mapOf(
    (25 to "Paulo"),
    (18 to "Renata"),
    (33 to "Kleber"),
    (51 to "Roberto"),
    (36 to "Carol")
)
//A variável person, abaixo, recebe a chave
//(key) e o valor (value) de cada elemento da coleção
for (person in people) {
    println(" ${person.key} => ${person.value}")
}
//Podemos quebrar a execução de um laço usando
//o comando break
var grades = arrayOf(10.0, 9.0, 8.5, 7.0, 9.5, 5.0, 22.0, 6.5, 10.0)
for (grade in grades) {
    println(grade)
    if (grade < 0.0 || grade > 10.0) {
        println("Nota inválida")
        break
    }
}
}