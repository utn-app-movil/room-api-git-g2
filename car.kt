interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {

    private var acceleration: Int = 0
    private var engineOn: Boolean = false

    override fun start_engine() {
        engineOn = true
        acceleration = 0
        println(" The car engine was started. Acceleration = $acceleration km/h²")
    }
    override fun accelerate(acceleration: Int) {
        this.acceleration += acceleration
        println("The current acceleration of the vehicle is ${this.acceleration}")
    }
}
