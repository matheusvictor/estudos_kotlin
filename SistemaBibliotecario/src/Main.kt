import models.Autor
import models.Editora
import models.Livro
import models.Usuario

fun main() {

    val a1: Autor = Autor("Jack")
    val a2: Autor = Autor("Chan")
    val e1: Editora = Editora("Skank literario")

    var lista_autores = mutableListOf<Autor>()

    lista_autores.add(a1)
    lista_autores.add(a2)

    val l1: Livro = Livro("HP", "123", e1, lista_autores)

    l1.adicionarAutor(a2)
    println(l1.exibirAutorPrincial())

    // println(l1.toString())

    val u1: Usuario = Usuario("usuario", "123", 23, "usuario", "123")
    u1.locarLivro(l1)
    u1.locarLivro(l1)
    u1.locarLivro(l1)
    u1.locarLivro(l1)
    u1.locarLivro(l1)
    println(u1.toString())


}