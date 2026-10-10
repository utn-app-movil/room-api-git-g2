interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{
  private var currentAcceleration: Int = 0

   // 1) start_engine
    override fun start_engine() {
        currentAcceleration = 0
        println("The vehicle was started. Acceleration = $currentAcceleration")
    }

    // 2) accelerate
    override fun accelerate(acceleration: Int) {
        currentAcceleration += acceleration
        println("Current acceleration = $currentAcceleration")
    }

    // 3) brake
    override fun brake() {
        TODO("Implementado por otro integrante")
    }

    // 4) turn_off_engine
    override fun turn_off_engine() {
        Acceleration = 0
        println("the vehicle was turned off. currentAcceleration = $acceleration")
    }
}
