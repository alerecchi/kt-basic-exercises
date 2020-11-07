package classes.library

import java.time.LocalDate

data class Book(
    val title: String,
    val author: String,
    val genre: Genre,
    val reading: Boolean = false,
    val finishDate: LocalDate? = null
)

enum class Genre {
    ADVENTURES_FICTION, TRAGEDY, NOVEL, DRAMA, COOKBOOK, ENCYCLOPEDIA, HISTORY
}

