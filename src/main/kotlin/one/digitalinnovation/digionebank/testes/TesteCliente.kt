package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
        val jose = Cliente(
            nome = "José Marques",
            cpf = "444.555.666-77",
            clienteTipo = ClienteTipo.PF,
            senha = "iaba-daba-du"
        )
    println(jose)
    TesteAutenticacao().autentica(jose)
}