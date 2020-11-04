package functions

fun main() {
    val greetings = getGreetings("advanced")

    println(greetings("Mark", 2020))
}

fun getGreetings(type: String): (String, Int) -> String {
    return when (type) {
        "basic" -> {
            { name, year -> "Hey $name, welcome to the Basic course $year. Let's start this journey!" }
        }
        "advanced" -> {
            { name, year -> "Hey $name, welcome to the Advanced course $year. Happy to see you back for more!" }
        }
        "master" -> {
            { name, year -> "Hey $name, welcome to the Master course $year. I think it's time you start teaching me instead!" }
        }
        else -> throw IllegalArgumentException("Course level not valid")
    }
}