package classes.library

import java.time.LocalDate

class Library(val books: MutableList<Book>) {

    companion object {
        fun fromOtherLibrary(oldLibrary: Library): Library {
            val newLibrary = Library(oldLibrary.books)
            newLibrary.finishedBooks = oldLibrary.finishedBooks
            return newLibrary
        }
    }

    var finishedBooks: Int = 0

    fun addBook(book: Book) {
        books.add(book)
    }

    fun startReading(bookTitle: String) {
        val index = books.indexOfFirst { bookTitle == it.title }
        if (index == -1) {
            throw BookNotFoundException(bookTitle)
        }
        books[index] = books[index].copy(reading = true)
        println("Started reading $bookTitle")
    }

    fun finishReading(bookName: String) {
        finishReading(bookName, LocalDate.now())
    }

    fun finishReading(bookTitle: String, date: LocalDate) {
        val index = books.indexOfFirst { bookTitle == it.title }
        if (index == -1) {
            throw BookNotFoundException(bookTitle)
        }
        books[index] = books[index].copy(reading = false, finishDate = date)
        finishedBooks++
        println("Finishing reading $bookTitle")
    }
}

class BookNotFoundException(bookTitle: String) : Exception("Book not found $bookTitle")

