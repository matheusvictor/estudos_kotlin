package directory

import models.Autor
import models.Editora
import models.Livro

class Biblioteca {

    var acervo: MutableList<Livro> = mutableListOf(
        Livro("", "",
            Editora(""),
            mutableListOf(
                Autor("")
            )
        )
    )

}