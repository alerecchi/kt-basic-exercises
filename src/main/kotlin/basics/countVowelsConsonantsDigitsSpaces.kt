package basics

fun main() {

    print("Give me a word or a sentence: ")
    val input: String? = readLine()

    var vowels: Int = 0
    var consonants: Int = 0
    var digits: Int = 0
    var spaces: Int = 0

    if (input != null) {
        for (char in input) {
            when {
                isVowel(char) -> vowels++
                isConsonant(char) -> consonants++
                isDigit(char) -> digits++
                isSpace(char) -> spaces++
            }
        }
    }
    println("""
        Your inptut had: 
            - $vowels vowel/s
            - $consonants consonant/s
            - $digits digit/s
            - $spaces space/s
    """.trimIndent())
}

fun isDigit(char: Char): Boolean {
    return char in '0'..'9'
}

fun isSpace(char: Char): Boolean {
    return char == ' '
}

fun isConsonant(char: Char): Boolean {
    return char in 'a'..'z'
}