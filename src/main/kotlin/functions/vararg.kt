package functions

fun main() {

    println(sumAll(1, 2, 3, 4, 5))
}

fun sumAll(vararg values: Int): Int {
    var sum = 0
    for (item in values) {
        sum += item
    }
    return sum
}