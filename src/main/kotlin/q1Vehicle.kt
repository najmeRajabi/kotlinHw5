fun main() {
    val vehicleList = arrayListOf<Any>()
    val yellowTaxi = Taxi()
    val amirTaxi = Taxi()
    val beheshtiSchoolBus =Bus()
    val redBus =Bus()
    val gharaziAmbulance = Ambulance()
    val saeedTruck =Truck()
    val goliCar =SportCar()
    val aliCar = SportCar()
    val greenVan = Van()
    val johnVan = Van()

}
interface Vehicle{
    val name :String
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
        get() = TODO("Not yet implemented")
}
interface ServiceTransportationVehicle:Vehicle{
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
        get() = TODO("Not yet implemented")
}
interface PrivateTransportationVehicle:Vehicle{
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
        get() = TODO("Not yet implemented")
}
class Taxi:PublicTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}
class Bus:PublicTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}
class Ambulance:ServiceTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}
class Truck:ServiceTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}
class SportCar:PrivateTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}
class Van:PrivateTransportationVehicle{
    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}