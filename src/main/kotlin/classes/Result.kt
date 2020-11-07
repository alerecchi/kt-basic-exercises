package classes

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    val intResult = convertToInt("s")

    when(intResult) {
        is Result.Success -> println("Here is the converted number times 2: ${intResult.data * 2}")
        is Result.Error -> println(intResult.exception)
    }

    val intResult2 = convertToInt("5")

    when(intResult2) {
        is Result.Success -> println("Here is the converted number times 2: ${intResult2.data * 2}")
        is Result.Error -> println(intResult2.exception)
    }
}

sealed class Result<T> {
    data class Success<T>(val data: T): Result<T>()
    data class Error<T>(val exception: Exception): Result<T>()
}

fun convertToInt(s: String): Result<Int> {
    return try {
        val intValue = s.toInt()
        Result.Success(intValue)
    } catch (ex: NumberFormatException) {
        Result.Error(ex)
    }
}