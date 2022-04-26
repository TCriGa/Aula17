package Exercicio02

class Livros (var titulo: String, var qtdPaginas: Int, var paginasLidas: Int) {

    val listaDeLivros : ArrayList<Livros> = ArrayList()

    fun verificarProgresso(): Int{

        return paginasLidas * 100/qtdPaginas
    }

    fun exibirMensagem(){
        println("O livro $titulo possui $qtdPaginas páginas")
        println("Você já leu ${verificarProgresso()}% do livro")
    }

    fun quantidadeLivros(): Int{
        println("|-----Quantidade de Livros----|")
        println("Informe a quantidade de Livros:")
        return readln().toInt()
    }

    fun coletarInformacoes(): Livros{
        println("Informe o título do livro: ")
        titulo = readln()

        println("Informe a quantidade de páginas do livro: ")
        qtdPaginas = readln().toInt()

        println("Informe quantas páginas você já leu: ")
        paginasLidas = readln().toInt()

        return Livros(titulo, qtdPaginas, paginasLidas)
    }

    fun inserirLivrosLista(Livros:Livros){
        listaDeLivros.add(Livros)
    }

    fun exibirListaLivros(){
        println("|--------Lista De Livros--------------------|")
        listaDeLivros.forEach {
            it.exibirMensagem()
        }
    }
}
