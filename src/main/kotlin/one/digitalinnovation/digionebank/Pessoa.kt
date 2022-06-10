package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Wallace"
    var cpf: String = "123.123.123-11"
        private set

    constructor() // consigo criar uma função dentro da class/objeto por conta do constructor().
    fun pessoaInfo(): String = "${name} e ${cpf}" //interpolação

}

    fun main(){
        val wallace = Pessoa()

        println(wallace.pessoaInfo()) // Estou fazendo meu objeto Pessoa() chamar sua função pessoaInfo()
    }
