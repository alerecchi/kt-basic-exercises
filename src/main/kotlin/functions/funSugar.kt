package functions

fun main() {
    createStudent("Mark", 22, 94, true)
    println()
    createStudent("Lisa", 23, 94)
    createStudent("Peter", 25)
    createStudent("Micheal", 21, enrolled = true)
}

fun createStudent(
    name: String,
    age: Int,
    gradeAverage: Int = -1,
    enrolled: Boolean = false
) {

    if (enrolled) {
        println(
            """
        The student named $name, $age years old
        ${if (isGoodStudent(gradeAverage)) "is" else "is not"} a good student.
        """.trimIndent()
        )
    }
}

fun isGoodStudent(gradeAverage: Int): Boolean = (gradeAverage > 75)