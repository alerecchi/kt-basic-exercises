package basics

fun main() {

    print("Give me one number: ")
    val firstNumberInput: String? = readLine()

    print("Then an operation (+,-,/,*): ")
    val operationInput: String? = readLine()

    print("Then the second number: ")
    val secondNumberInput: String? = readLine()

    if(firstNumberInput != null && operationInput != null && secondNumberInput != null) {
        val firstNumber: Int = firstNumberInput.toInt()
        val operation: Char = operationInput[0]
        val secondNumber: Int = secondNumberInput.toInt()
        val result = calculateResult(firstNumber,secondNumber, operation)
        println("The result of the operation $firstNumber $operation $secondNumber is: $result")
    }
}

fun calculateResult(firstNumber: Int, secondNumber:Int, operation: Char): Number {
    return when(operation) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber.toDouble() / secondNumber.toDouble()
        else -> throw IllegalArgumentException("Operation not supported")
    }
}