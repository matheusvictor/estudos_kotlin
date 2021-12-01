package models

class Editora(private val nomeEditora: String) {

    private var endereco: String = "Endereço não informado!"
    private var telefoneEditora: String = "Telefone não informado!"

    constructor(nomeEditora: String, endereco: String, telefoneEditora: String) : this(nomeEditora) {
        this.endereco = endereco
        this.telefoneEditora = telefoneEditora
    }

    @Override
    override fun toString(): String {
        return "${this.nomeEditora} | Endereço: ${this.endereco} | Telefone: ${this.telefoneEditora}"
    }
}