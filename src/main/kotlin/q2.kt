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
class Manager:Employee(){
    override val name: String
        get() = name
    override val age: Int
        get() = age
    override val hourRate: Double
        get() = hourRate

    override fun salary(hours: Double): Double {
        return hourRate*hours
    }
}
class Clerk():Employee(){
    override val name: String
        get() = name
    override val age: Int
        get() = age
    override val hourRate: Double
        get() = hourRate

    override fun salary(hours: Double): Double {
        return  hourRate*hours/2
    }
}
data class Customer(var name :String,var age:Int,var gender:Gender){}