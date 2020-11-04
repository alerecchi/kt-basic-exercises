package functions

fun main() {

    (1..10).myForEach{
        println(it)
    }

    ('a'..'z').myForEachIndexed{ letter, index ->
        println("Letter $letter is the number $index in the alphabet")
    }
}

fun IntRange.myForEach(block: (Int) -> Unit) {
    for (element in this) {
        block(element)
    }
}

fun CharRange.myForEachIndexed(block: (Char, Int) -> Unit) {
    var index = 0
    for (element in this) {
        block(element, index)
        index++
    }
}