package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria Ângela", cpf = "187.188.189-18", salario = 5000.00 )
    ImprimeRelatorioFuncionario.imprime(maria)
}