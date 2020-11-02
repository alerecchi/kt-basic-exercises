package basics

fun main() {
    print("Give me a number: ")
    val input: String? = readLine()

    if(input != null) {
        val intInput: Int = input.toInt()
        val factorial: Long = calculateFactorial(intInput)
        println("The factorial of the number $intInput is $factorial")
    }
}

fun calculateFactorial(number: Int): Long {
    var factorial: Long = 1
    for (i in 1..number) {
        factorial = factorial * i
    }
    return factorial
}