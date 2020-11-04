package functions

fun main() {
    greetingsV1()
    greetingsV2()
    greetingsV3()
}

fun greetingsV1() {
    val greetings: () -> String = {
        "Hey, Welcome to the Kotlin Course"
    }

    println(greetings())
}

fun greetingsV2() {
    val greetings: (String) -> String = {
        "Hey $it, Welcome to the Kotlin Course"
    }

    println(greetings("Mark"))
}

fun greetingsV3() {
    val greetings: (String, Int) -> String = { name, year ->
        "Hey $name, Welcome to the Kotlin Course $year"
    }

    println(greetings("Mark", 2020))
}