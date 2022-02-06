fun main() {

}
interface PublicTransportationVehicle {
    fun maxSpeed()
    fun maxCapacity()
}
interface ServiceTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
interface PrivateTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
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