interface IVehicle{  
  fun start_engine() //print a message the vehicle was started and the acceleration is 0
  fun accelerate(acceleration: Int) //print a message the current acceleration of the vehicle, you need to sum the new acceleration
  fun brake() //print a message the vehicle is stopped and the acceleration is 0
  fun turn_off_engine() //print a message the vehicle was turned off with acceleration = 0
}

class Car: IVehicle{

  private var acceleration = 0;
  private var turnedOn = true;

   constructor(acceleration: Int, turnedOn: Boolean){
    this._acceleration = acceleration;
    this._turnedOn = turnedOn; 
   }
  
  override fun brake{ //Jorjan
    acceleration = 0;
    println("The vehicle is stopped. The acceletarion is $acceleration")
  }
  
  override fun turn_off_engine { //Jorjan
    acceleration = 0; 
    turnedOn = false; 
    if turnedOn == false {
      println("The vehicle was turned off. The acceleration is $acceleration ")
    }
  }
}
