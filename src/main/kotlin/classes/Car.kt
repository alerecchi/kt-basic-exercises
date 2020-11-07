package classes

fun main() {

    val car = Car(9)

    car.drive()
    car.drive()
    println("Fueling the car with 40: ${car.refuel(40)}")
    println("Fueling the car with 70: ${car.refuel(70)}")
}

interface Vehicle {
    fun drive()
    fun refuel(amount: Int): Boolean
}

class Car(private var fuel: Int) : Vehicle {

    override fun drive() {
        if(fuel > 0) {
            println("Driving...")
            if(fuel > 10)
                fuel -= 10
            else
                fuel = 0
        } else {
            println("No fuel")
        }
    }

    override fun refuel(amount: Int): Boolean {
        return if(fuel + amount < 100) {
            fuel += amount
            true
        } else {
            false
        }
    }

}