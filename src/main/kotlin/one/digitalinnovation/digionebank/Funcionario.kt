package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected  /*Assim somente a classe mãe e filhas poderão alterar */ abstract fun calculoAuxilio(): Double

    //abaixo temos a implementação de um hook, uma função chamando outra função.
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}
    """.trimIndent()
}