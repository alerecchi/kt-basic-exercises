package basics

fun main() {

    print("Give me a word: ")
    val input: String? = readLine()

    var vowels: Int = 0
    var consonants: Int = 0

    if (input != null) {
        for (char in input) {
            if(isVowel(char)) {
                vowels++
            } else {
                consonants++
            }
        }
    }
    println("Your input had $vowels vowel/s and $consonants consonant/s")
}