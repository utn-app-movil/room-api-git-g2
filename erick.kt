interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{
  interface IVehicle {
      fun start_engine()  // The vehicle was started, acceleration = 0
      fun accelerate(acceleration: Int)  // Show the current acceleration
      fun brake()  // The vehicle stops, acceleration = 0
      fun turn_off_engine()  // The vehicle was turned off, acceleration = 0
  }

  class Car : IVehicle {
      private var acceleration = 0

      override fun start_engine() {
          acceleration = 0
          println("The vehicle was started. Acceleration = $acceleration")
      }

      override fun accelerate(acceleration: Int) {
          this.acceleration += acceleration
          println("Accelerating... Current acceleration = ${this.acceleration}")
      }

      override fun brake() {
          acceleration = 0
          println("The vehicle has stopped. Acceleration = $acceleration")
      }

      override fun turn_off_engine() {
          acceleration = 0
          println("The vehicle was turned off. Acceleration = $acceleration")
      }
  }

  fun main() {
      val car = Car()
      car.start_engine()
      car.accelerate(20)
      car.brake()
      car.turn_off_engine()
  }


}
