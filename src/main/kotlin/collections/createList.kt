package collections

import java.lang.NumberFormatException

fun main() {

    val inputList = mutableListOf<Int>()

    do {
        print("Give me a number: ")
        val inputString = readLine() ?: ""
        try {
            inputList.add(inputString.toInt())
        }catch (ignored: NumberFormatException) {}
    } while (inputString != "done")

    println(inputList)
}