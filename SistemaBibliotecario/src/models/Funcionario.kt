package models

class Funcionario(nome: String, cpf: String, idade: Int, private val root: Boolean) : Pessoa(nome, cpf, idade) {

    fun adicionarUsuario(): Boolean {
        return false
    }

    fun modificarUsuario(){
        //TODO
    }

    fun excluirUsuario(): Boolean {
        return false
    }

    fun cadastrarLivro(): Boolean {
        return false
    }

    fun excluirLivro(): Boolean {
        return false
    }
}