package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta ( // Aqui eu criei minha classe com o construtor primário (essas informações dentro do parenteses)
    val agencia: String,
    val conta: String,
    val saldo: BigDecimal
    ){
    fun deposito(valor: BigDecimal){

    }
    fun saque (valor: BigDecimal) {

    }
}