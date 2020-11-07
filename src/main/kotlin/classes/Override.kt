package classes

fun main() {
    val base = Base()
    base.displayMessage("Mark")
    val derived = Derived()
    base.displayMessage("Jeff")
}

open class Base {

    open fun displayMessage(name: String) {
        println("Hey $name, it's me the Base Class")
    }
}

class Derived: Base() {

    override fun displayMessage(name: String) {
        println("Hey $name, it's me the Derived Class, don't get confused")
    }
}