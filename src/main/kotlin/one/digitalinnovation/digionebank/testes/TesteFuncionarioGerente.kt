package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Logavel

fun main() {
    val maria = Gerente(nome = "Maria Ângela", cpf = "187.188.189-18", salario = 5000.00, senha = "senha123" )
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}