package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "João Rodrigues", cpf = "111.222.333-12", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}