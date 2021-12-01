package models

class Livro(
    private val titulo: String,
    private val isbn: String,
    private var editora: Editora,
    private var autores: MutableList<Autor> = mutableListOf<Autor>(),
) {

    private var edicao: Int = 1
    private var anoPublicacao: Int = 0
    private var categoria: CategoriaLivro = CategoriaLivro.NAO_CADASTRADA

    constructor(
        titulo: String,
        isbn: String,
        editora: Editora,
        autores: MutableList<Autor> = mutableListOf<Autor>(),
        edicao: Int,
        anoPublicacao: Int,
        categoria: CategoriaLivro,
    ) : this(
        titulo,
        isbn,
        editora,
        autores
    ) {
        this.edicao = edicao
        this.anoPublicacao = anoPublicacao
        this.categoria = categoria
    }

    fun exibirAutorPrincial(): Autor? {
        return if (this.autores.isEmpty()) null else this.autores[0]
    }

    fun adicionarAutor(autor: Autor): Boolean {
        return this.autores.add(autor)
    }

    @Override
    override fun toString(): String {
        return "Título: ${this.titulo}\n" +
                "Categoria: ${this.categoria.descricao}\n" +
                "Autor(es): ${this.autores}\n" +
                "Editora: ${this.editora}"
    }

}
