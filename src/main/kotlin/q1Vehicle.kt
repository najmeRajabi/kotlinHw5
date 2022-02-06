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
    var sortedBaseCapacity = arrayListOf<Vehicles>()
    for (item in 0 until vehicleList.size){
        if (vehicleList[item] > vehicleList[item+1]){}
    }


}
abstract class Vehicles:Comparable<Vehicles>{
    override fun compareTo(other: Vehicles): Int {
        var result = 0
        if (this is Truck ){
            result = -1
        }else if (this is SportCar){
            result = 1
        }
        return result
    }
}
interface Vehicle{
    val name :String
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed():Int
    fun maxCapacity():Int
    override val name: String
        get() = TODO("Not yet implemented")
}
interface ServiceTransportationVehicle:Vehicle{
    fun maxSpeed():Int
    fun maxCapacity():Int
    override val name: String
        get() = TODO("Not yet implemented")
}
interface PrivateTransportationVehicle:Vehicle{
    fun maxSpeed():Int
    fun maxCapacity():Int
    override val name: String
        get() = TODO("Not yet implemented")
}
class Taxi:PublicTransportationVehicle, Vehicles() {
    override fun maxSpeed():Int {
        return 100
    }

    override fun maxCapacity():Int {
        return 4
    }
}
class Bus:PublicTransportationVehicle,Vehicles(){
    override fun maxSpeed():Int {
        return 80
    }

    override fun maxCapacity():Int {
        return 42
    }
}
class Ambulance:ServiceTransportationVehicle,Vehicles(){
    override fun maxSpeed():Int {
        return 120
    }

    override fun maxCapacity():Int {
        return 5
    }
}
class Truck:ServiceTransportationVehicle,Vehicles(){
    override fun maxSpeed():Int {
        return 70
    }

    override fun maxCapacity():Int {
        return 1
    }
}
class SportCar:PrivateTransportationVehicle,Vehicles(){
    override fun maxSpeed():Int {
        return 300
    }

    override fun maxCapacity():Int {
        return 2
    }
}
class Van:PrivateTransportationVehicle,Vehicles(){
    override fun maxSpeed():Int {
        return 90
    }

    override fun maxCapacity():Int {
        return 15
    }
}
