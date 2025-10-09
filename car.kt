class Car : IVehicle {

    private var acceleration: Int = 0
    private var engineOn: Boolean = false

    override fun start_engine() {
        engineOn = true
        acceleration = 0
        println(" The car engine was started. Acceleration = $acceleration km/h²")
    }
}
