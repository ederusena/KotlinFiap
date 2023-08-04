package Colecoes

fun main(args: Array<String>) {
    var produtos = HashMap<String, Double>()
    produtos.put("Corsa", 12222.21)
    produtos.put("Chevette", 9000.11)
    produtos.put("Fiat", 20201.12)
    produtos.put("Vectra", 33111.12)

    println(produtos)

    //Criando um Map de Strings
    var movies = HashMap<Int,String> ()
    var catalog = mapOf(
        Pair(10,"Matrix"),
        Pair(20,"Vingadores"),
        Pair(30,"Jurassic Park"),
        Pair(40,"De Volta para o Futuro")
    )
//Utilize o método putAll para inserir o catálogo
    movies.putAll(catalog)
//Perceba que o catálogo de filmes está ordenado alfabeticamente
    println(movies) //{40=De Volta para o Futuro, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
    println(movies.count()) //4
    println("\n")
//Criando um set vazio
    var movies2 = HashSet<String> ()
//Inserindo 1 elemento
    movies.put(25,"Homem-Aranha: De Volta ao Lar")
    println(movies) //{40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 20=Vingadores, 30=Jurassic Park}
    println(movies.count()) //5
    println("\n")
//Perceba que o código abaixo irá alterar a quantidade
//de itens do Map pois ele aceita itens da chave NÃO repetidos.
//movies.put(25,"Homem-Aranha: De Volta ao Lar")
//Faça um teste com a linha superior de código e a inferir
    movies.put(35,"Homem-Aranha: De Volta ao Lar")
    println(movies)   //{40=De Volta para o Futuro, 25=Homem-Aranha: De Volta ao Lar, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
    println(movies.count()) //6
    println("\n")
//Removendo elemento
    movies.remove(25)
    println(movies)   //{40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park}
    println(movies.count()) //5
    println("\n")
//Pecorrendo um Map
    for (movie in movies) {
        println(movie)
    }
    println("\n")
//Verificando se determinado elemento está contido no List
    if (movies.containsValue("Matrix")) {
        println("Matrix está na minha lista de filmes favoritos!!")
    }
    println("\n")
//Vamos criar um novo map para realizarmos algumas operações
//No exemplo abaixo, usaremos um formato mais simplificado de criação de Map
    var myWifeMovies  = mapOf(
        Pair(100,"De Repente 30"),
        Pair(200,"Mensagem para você"),
        Pair(300,"Sintonia de Amor"),
        Pair(400,"De Volta para o Futuro"),
        Pair(500,"Jurassic Park")
    )
//Criando um Map com todos os filmes)
    var allMovies = movies + myWifeMovies
    println(allMovies) // {40=De Volta para o Futuro, 10=Matrix, 35=Homem-Aranha: De Volta ao Lar, 20=Vingadores, 30=Jurassic Park, 100=De Repente 30, 200=Mensagem para você, 300=Sintonia de Amor, 400=De Volta para o Futuro, 500=Jurassic Park}
    println(allMovies.count()) //10
    println("\n")
//Lendo Chave e Valor separadamente
    for(movie in allMovies) {
        println("Chave => Key => ${movie.key}")
        println("Valor => Value => ${movie.value}")
        var title = movie.value.uppercase()
        println("UpperCase => ${title}")
        title = movie.value.lowercase()
        println("LowerCase => ${title}")
        println("\n")
    }
//Executando uma pesquisa diretamente na chave do Map
    var film1 = allMovies.get(400)   //400=De Volta para o Futuro
    println("Title => ${film1}") // Retorna String. Retorna o Título
    var film2 = allMovies.get(999)   //Não existe
    println("Title => ${film2}") // Retorna null
//Verificando a possibilidade de testar antes de imprimir
    var code = 1234 // Experimente trocar o código
    var film3 = allMovies.get(code)   //Não existe
    if(film3.isNullOrEmpty()) {
        println("\nFilme com o código $code não encontrado!")
    } else {
        println("\nTitle => ${film3}") // Retorna o título
    }
}