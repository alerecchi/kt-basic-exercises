package classes.library

import java.time.LocalDate

fun main() {
    val book1 = Book(
        title = "Don Quixote de la Mancha",
        author = "Miguel de Cervantes",
        genre = Genre.NOVEL
    )

    val book2 = Book(
        title = "Moby-Dick",
        author = "Herman Melville",
        genre = Genre.ADVENTURES_FICTION
    )

    val book3 = Book(
        title = "The Great Gatsby",
        author = "Francis Cugat",
        genre = Genre.TRAGEDY
    )

    val library = Library(mutableListOf(book1))

    library.addBook(book2)
    library.addBook(book3)

    println("I read ${library.finishedBooks} book/s")

    library.startReading("Moby-Dick")
    library.finishReading("Moby-Dick")

    library.startReading("The Great Gatsby")
    library.finishReading("The Great Gatsby", LocalDate.of(2020, 11, 3))

    println("I read ${library.finishedBooks} book/s")

    library.startReading("Harry Potter")
    library.finishReading("Harry Potter")
}