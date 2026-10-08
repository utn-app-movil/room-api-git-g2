interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{

   private var currentAcceleration: Int = 0
   
   //made by Juan
  override fun start_engine() {
      println("The vehicle was started and the acceleration is 0")
  }
}

fun main() {
    val car = Car()
    car.start_engine()
  
}
