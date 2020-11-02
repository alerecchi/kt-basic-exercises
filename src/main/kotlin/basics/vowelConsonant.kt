package basics

fun main() {
    print("Input a character: ")
    val input: String? = readLine()

    if(input != null) {
        if (isVowel(input[0])) {
            println("Char is a vowel")
        } else {
            println("Char is a consonant")
        }
    }
}

fun isVowel(c: Char): Boolean {
    return c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'
}