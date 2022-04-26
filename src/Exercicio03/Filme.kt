package Exercicio03

class Filme(var titulo: String, var duracaoEmMinutos: Int) {
    val listaFilme: ArrayList<Filme> = ArrayList()

    fun SolicitarqtdFilme(): Int {
        println("Informe a quantidade de filmes em cartaz: ")
        return readln().toInt()
    }

    fun coletarInformacao(): Filme {
        println("Informe o nome do filme: ")
        titulo = readln()

        println("Informe a duração do filme em minutos: ")
        duracaoEmMinutos = readln().toInt()

        return Filme(titulo, duracaoEmMinutos)
    }

    fun conversaoEmHoras() {
        val horas = duracaoEmMinutos / 60
        var minutos = 0.0
        minutos = (duracaoEmMinutos % 60).toDouble()

        println(" O filme $titulo possui $horas horas e $minutos minutos de duração")

    }

    fun inserirFilmesLista(Filme: Filme) {
        listaFilme.add(Filme)
    }

    fun exibirFilmesEmCartaz() {
        println("|-------------Filmes em Cartaz -------------| ")
        listaFilme.forEach {

            println(it.titulo)
        }
    }

    fun exibirListaFIlmes() {
        println("|------Duração dos Filmes em Cartaz-------------|")
        listaFilme.forEach {
            it.conversaoEmHoras()
        }

    }


}