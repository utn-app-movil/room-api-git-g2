interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {
    var acc = 0
    
    override fun start_engine() {
        acc = 0
        println("Engine started - acceleration is $acc")
    }

    override fun accelerate(acceleration: Int) {
        acc = acc + acceleration
        println("Accelerating - current acceleration: $acc")
    }

    override fun brake() {
        acc = 0
        println("Braking - vehicle stopped, acceleration is $acc")
    }

    override fun turn_off_engine() {
        acc = 0
        println("Engine off - acceleration is $acc")
    }
}

fun main() {
    val vehicle = Car()
    
    vehicle.start_engine()
    vehicle.accelerate(10)
    vehicle.accelerate(20)
    vehicle.accelerate(5)
    vehicle.brake()
    vehicle.turn_off_engine()
}