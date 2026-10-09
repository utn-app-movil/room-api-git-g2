interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  //fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  //fun brake() //print a message the vehicle is stopped and the acceleration is 0
  //fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{   

private var xlr8: Int = 0
override fun start_engine() {
        if (!engineOn) {
            engineOn = true
            xlr8 = 0
            println("El vehículo arrancó, aceleración actual: ${xlr8}km/h")
        } else {
            println("El vehículo ya estaba en marcha")
        }
    }

override fun accelerate(acceleration: Int) {
        if (!engineOn) {
            println("Primero debes arrancar el vehículo")
            return
        }
        xlr8 += acceleration
        println("Aceleración actual: ${xlr8}km/h")
    }
}

fun brake() //print a message the vehicle is stopped and the acceleration is 0
fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0

fun main(){
  val car = Car()
  car.start_engine()
  car.accelerate(30)
}