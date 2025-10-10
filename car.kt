import java.io.IO.println

interface IVehicle{
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car : IVehicle {

    private var acceleration = 0
    private var engineOn = false

    override fun start_engine() {
        engineOn = true
        acceleration = 0
        println("The car engine was started. Acceleration is $acceleration.")
    }

    override fun accelerate(acceleration: Int) {
        if (engineOn) {
            this.acceleration += acceleration
            println("The car accelerates. Current acceleration: ${this.acceleration}.")
        } else {
            println("Cannot accelerate. The engine is off.")
        }
    }

    override fun brake() {
        acceleration = 0
        println("The car stopped. Acceleration is $acceleration.")
    }

    override fun turn_off_engine() {
        if (acceleration == 0) {
            engineOn = false
            println("The car engine was turned off.")
        } else {
            println("Cannot turn off the engine while the car is moving.")
        }
    }
}


class Motorcycle : IVehicle {

    private var speed = 0
    private var engineStarted = false

    override fun start_engine() {
        engineStarted = true
        speed = 0
        println("The motorcycle engine is now on. Speed is $speed.")
    }

    override fun accelerate(acceleration: Int) {
        if (engineStarted) {
            speed += acceleration
            println("The motorcycle speeds up. Now it goes at $speed.")
        } else {
            println("You can't accelerate, the engine is off.")
        }
    }

    override fun brake() {
        speed = 0
        println("The motorcycle stopped. Speed is $speed.")
    }

    override fun turn_off_engine() {
        if (speed == 0) {
            engineStarted = false
            println("The motorcycle engine was turned off.")
        } else {
            println("Can't turn off the engine while moving.")
        }
    }
}

