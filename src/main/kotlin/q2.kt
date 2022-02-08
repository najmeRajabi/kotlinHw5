fun main() {

}
enum class Gender{
    Male , Female
}
abstract class Employee{
    abstract val name:String
    abstract val age:Int
    abstract val hourRate:Double

    abstract fun salary( hours:Double):Double
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
}
class Manager(override val name: String, override val age: Int,
              override val hourRate: Double):Employee(){

    override fun salary(hours: Double): Double {
        return hourRate*hours
    }
}
class Clerk(override val name: String,override val age: Int,
            override val hourRate: Double):Employee(){

    override fun salary(hours: Double): Double {
        return  hourRate*hours/2
    }
}
data class Customer(var name :String,var age:Int,var gender:Gender){}
class Main1{
    var ali = Manager("Ali",25,104.0)
    var reza = Manager("Reza",42,120.0)
    var farhad = Manager("Farhad",34,120.0)
    val sama = Clerk("Sama" , 26 , 110.0)
    val hours= arrayListOf(140,150,130,180)
    val sara = Customer("sara",22,Gender.Female)
    val maryam = Customer("maryam" , 30 , Gender.Female)

}