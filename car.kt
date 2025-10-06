interface IVehicle{
  //print a message the vehicle was started and the acceleration is 0  
  fun start_engine()
  //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun accelerate(acceleration: Int)
  //print a message the vehicle is stopped and the acceleration is 0
  fun brake()
  //print a message the vehicle was turned off with acceleration = 0
  fun turn_off_engine()
}

class Car: IVehicle{

  private var _acceleration = 0;
  private var _turnedOn = false;

  constructor(acceleration: Int, turnedOn: Boolean){
    this._acceleration = acceleration;
    this._turnedOn = turnedOn; 
  }
  
  //Esteban
  override fun start_engine() { 
    _acceleration = 0
    _turnedOn = true
    println("The vehicle was started and the acceleration is $_acceleration")
  }

  //Esteban
  override fun accelerate(acceleration: Int) { 
    if (_turnedOn) {
        this._acceleration += (acceleration + 5)
        println("The current acceleration of the vehicle is $_acceleration")
    } else {
        println("Cannot accelerate. The vehicle is off.")
    }
  }

  override fun brake() { //Jorjan
    _acceleration = 0;
    println("The vehicle is stopped. The acceleration is $_acceleration")
  }
  
  override fun turn_off_engine() { //Jorjan
    _acceleration = 0; 
    _turnedOn = false; 
    if (_turnedOn == false) {
      println("The vehicle was turned off. The acceleration is $_acceleration ")
    }
  }
}
