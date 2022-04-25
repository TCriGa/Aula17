package Exercicio01

fun main() {
    val novoFuncionario: Funcionario = Funcionario("luis", "Silva", 10, 25.50)
    val novoFuncionario1: Funcionario = Funcionario("José", " Pedro", 10, 30.8)
    val novoFuncionario2: Funcionario = Funcionario("Maria", "Santos", 15, 24.5)
    val novoFuncionario3: Funcionario = Funcionario("Sandra", "Cavalcante", 12, 25.55)
    val novoFuncionario4: Funcionario = Funcionario("Guilherme", " Torres", 13, 26.6)
    val novoFuncionario5: Funcionario = Funcionario("Pedro", " Silveira", 16, 33.5)
    val novoFuncionario6: Funcionario = Funcionario("André", "Soares", 18, 28.5)
    val novoFuncionario7: Funcionario = Funcionario("Thiago", "Silveira", 17, 29.5)
    val novoFuncionario8: Funcionario = Funcionario("João", "Cabral", 20, 30.5)
    val novoFuncionario9: Funcionario = Funcionario("Judas", " Escariote", 11, 33.5)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()


    val listaFuncionario = ArrayList<Funcionario>()
    listaFuncionario.add(novoFuncionario)
    listaFuncionario.add(novoFuncionario1)
    listaFuncionario.add(novoFuncionario2)
    listaFuncionario.add(novoFuncionario3)
    listaFuncionario.add(novoFuncionario4)
    listaFuncionario.add(novoFuncionario5)
    listaFuncionario.add(novoFuncionario6)
    listaFuncionario.add(novoFuncionario7)
    listaFuncionario.add(novoFuncionario8)
    listaFuncionario.add(novoFuncionario9)

    println("|----------------------Lista Funcionários-----------------------|")

    listaFuncionario.forEach { funcionario ->
        funcionario.nomeCompleto()
        funcionario.incrementarHoras(8)
        funcionario.calcularSalario()
        println()
    }


}



