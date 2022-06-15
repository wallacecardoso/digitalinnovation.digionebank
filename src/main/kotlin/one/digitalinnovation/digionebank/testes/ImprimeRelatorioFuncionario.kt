package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object /*método estático que eu consigo invocar via classe e não via instância. */ {
        fun imprime (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}