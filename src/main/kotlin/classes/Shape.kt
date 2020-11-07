package classes

fun main() {
    val rectangle = Rectangle(3, 5)
    val triangle = Triangle(7.0, 3.0)
    val square = Square(5.0)

    printArea(rectangle)
    printArea(triangle)
    printArea(square)
}

private fun printArea(shape: Shape) {
    val area = shape.area()
    println(area)
}

private abstract class Shape(
    protected val width: Double,
    protected val height: Double
) {
    abstract fun area(): Double
}

private open class Rectangle(
    width: Double,
    height: Double
) : Shape(width, height) {

    constructor(width: Int, height: Int) : this(width.toDouble(), height.toDouble())

    override fun area(): Double = width * height
}

private class Square(side: Double) : Rectangle(side, side) {
    constructor(side: Int) {
    }
}

private class Triangle(
    width: Double,
    height: Double
) : Shape(width, height) {

    constructor(width: Int, height: Int) : this(width.toDouble(), height.toDouble())

    override fun area(): Double = (width * height) / 2

}