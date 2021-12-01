package models

class Usuario(
    nome: String,
    cpf: String,
    idade: Int,
    private val login: String,
    private var senha: String,
    private var livrosLocados: MutableList<Livro> = mutableListOf(),
) :
    Pessoa(nome, cpf, idade) {

    fun locarLivro(livro: Livro): Boolean {
        return if (livrosLocados.count() < 3) {
            this.livrosLocados.add(livro)
            true
        } else false
    }

    fun devolverLivro(): Boolean {
        return false
    }

    fun excluirConta(): Boolean {
        return false
    }

    @Override
    override fun toString(): String {
        return "${this.livrosLocados}"
    }
}