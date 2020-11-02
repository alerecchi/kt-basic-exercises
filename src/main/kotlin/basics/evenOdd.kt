package basics

import java.lang.NumberFormatException

fun main() {
    print("Give me a number: ")
    val input: String? = readLine()
    if(input != null) {
        try {
            val intInput: Int = input.toInt()
            if (isEven(intInput)) {
                println("Number $intInput is even")
            } else {
                println("Number $intInput is odd")
            }
        } catch (ex: NumberFormatException) {
            println("Error: input was not a number")
        }

    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}