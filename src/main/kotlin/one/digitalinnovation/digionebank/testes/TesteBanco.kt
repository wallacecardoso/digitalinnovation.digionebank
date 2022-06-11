package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco (nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero) // versão mais extensa

    val banco2 = digiOneBank.copy (nome = "Banco 02", numero = 2) // versão mais concisa, usando a função da data class.

    println(banco2.info())
}