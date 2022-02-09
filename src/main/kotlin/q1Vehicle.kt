fun main() {
    val vehicleList = arrayListOf<Vehicles>()
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
    vehicleList.addAll(arrayOf(yellowTaxi,amirTaxi,beheshtiSchoolBus,
        redBus,gharaziAmbulance,saeedTruck,goliCar,aliCar,greenVan,johnVan))
    vehicleList.sortBy { vehicles -> vehicles.maxCapacityVar }
    vehicleList.forEach{ println(it) }
    println(".....................................................................................")
    vehicleList.sortBy { vehicles -> vehicles.maxSpeedVar }
    for (i in vehicleList.size-1 downTo 0){
        println(vehicleList[i])
    }


}
abstract class Vehicles{
    abstract var maxSpeedVar :Int
    abstract var maxCapacityVar:Int
}
interface PublicTransportationVehicle {
    fun maxSpeed():Int
    fun maxCapacity():Int
}
interface ServiceTransportationVehicle{
    fun maxSpeed():Int
    fun maxCapacity():Int
}
interface PrivateTransportationVehicle{
    fun maxSpeed():Int
    fun maxCapacity():Int
}
class Taxi:PublicTransportationVehicle, Vehicles() {
    override var maxSpeedVar =100
    override var maxCapacityVar = 4

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }

}
class Bus:PublicTransportationVehicle,Vehicles(){
    override var maxSpeedVar =80
    override var maxCapacityVar = 42

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }
}
class Ambulance:ServiceTransportationVehicle,Vehicles(){
    override var maxSpeedVar =120
    override var maxCapacityVar = 5

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }
}
class Truck:ServiceTransportationVehicle,Vehicles(){
    override var maxSpeedVar =70
    override var maxCapacityVar = 1

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }
}
class SportCar:PrivateTransportationVehicle,Vehicles(){
    override var maxSpeedVar =300
    override var maxCapacityVar = 2

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }
}
class Van:PrivateTransportationVehicle,Vehicles(){
    override var maxSpeedVar =90
    override var maxCapacityVar = 15

    override fun maxSpeed():Int {
        return maxSpeedVar
    }

    override fun maxCapacity():Int {
        return maxCapacityVar
    }
}
