interface IVehicle {
  fun start_engine() // print: vehicle started, acceleration = 0
  fun accelerate(acceleration: Int) // print: current acceleration
  fun brake() // print: stopped, acceleration = 0
  fun turn_off_engine() // print: turned off, acceleration = 0
}

class Car : IVehicle {
  private var acceleration = 0
  private var engineOn = false

  override fun start_engine() {
    engineOn = true
    acceleration = 0
    println("The vehicle was started. Acceleration = $acceleration")
  }

  override fun accelerate(acceleration: Int) {
    if (engineOn) {
      this.acceleration += acceleration
      println("Current acceleration: ${this.acceleration}")
    } else {
      println("Cannot accelerate. The engine is off.")
    }
  }

  override fun brake() {
    acceleration = 0
    println("The vehicle is stopped. Acceleration = $acceleration")
  }

  override fun turn_off_engine() {
    acceleration = 0
    engineOn = false
    println("The vehicle was turned off. Acceleration = $acceleration")
  }
}

