interface IVehicle {  
    fun start_engine() // print a message the vehicle was started and the acceleration is 0
    fun accelerate(acceleration: Int) // print a message the current acceleration of the vehicle, you need to sum the new acceleration
    fun brake() // print a message the vehicle is stopped and the acceleration is 0
    fun turn_off_engine() // print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {

    var acceleration = 0

    // Implemented by Abdiel Torres 
    override fun start_engine() {
        acceleration = 0
        println("The vehicle was started and the acceleration is 0")
    }

    // To be implemented by another team member
    override fun accelerate(acceleration: Int) {
        // Pending implementation
    }

    // Implemented by Daniel López
    override fun brake() {
        acceleration = 0
        println("The vehicle is stopped and the acceleration is 0")
    }

    // Implemented by Daniel López
    override fun turn_off_engine() {
        acceleration = 0
        println("The vehicle was turned off with acceleration = 0")
    }
}

fun main() {
    val car = Car()

    car.start_engine()
    car.brake()
    car.turn_off_engine()
}