package Exercicio02

class TestarLivros {
}


fun main() {
    val livroFavorito : Livros = Livros("",0,0)

    val quantidade = livroFavorito.quantidadeLivros()

    for (i in 1 .. quantidade) {

        livroFavorito.inserirLivrosLista(livroFavorito.coletarInformacoes())
    }

    livroFavorito.exibirListaLivros()
}