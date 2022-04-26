package Exercicio03

fun main() {
    val filmes: Filme = Filme("", 0)

    val quantidade = filmes.SolicitarqtdFilme()

    for (i in 1..quantidade) {
        filmes.inserirFilmesLista(filmes.coletarInformacao())
    }

    filmes.exibirFilmesEmCartaz()
    filmes.exibirListaFIlmes()
}