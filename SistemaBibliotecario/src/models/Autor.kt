package models

class Autor(protected val nomeAutor: String) {

    protected var emailContatoAutor: String = "E-mail para contato não informado"

    constructor(nomeAutor: String, emailContatoAutor: String) : this(nomeAutor) {
        this.emailContatoAutor = emailContatoAutor
    }

    @Override
    override fun toString(): String {
        return "${this.nomeAutor}"
    }
}