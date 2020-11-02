package basics

fun main() {

    print("Give me a sentence: ")
    val input: String? = readLine()

    if(input != null) {

        var noSpaceString = ""
        for (char in input) {
            if(char != ' ') {
                noSpaceString += char
            }
        }
        print("The input without spaces is: ")
        println(noSpaceString)
    }
}