package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Wallace"
    var cpf: String = "123.123.123-11"
        private set

}

    fun main(){
        val wallace = Pessoa()

        println(wallace.name)
        println(wallace.cpf)

    }
