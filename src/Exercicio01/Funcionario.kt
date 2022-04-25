package Exercicio01

class Funcionario
    (
    var nome: String,
    var sobrenome: String,
    var horasTrabalhadas: Int,
    var valorPorHora: Double
) {

    fun nomeCompleto() {
        println("O funcionário $nome $sobrenome")
    }

    fun calcularSalario() {
        val valorSalario = horasTrabalhadas * valorPorHora

        println("O funcionário $nome irá receber $valorSalario")
    }

    fun incrementarHoras(horasIncrementadas: Int) {

        horasTrabalhadas += horasIncrementadas
    }
}