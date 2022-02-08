fun main() {
    val main = Main()
    main.printToString()
    main.printTotalPayment()


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
class Main{
    var ali = Manager("Ali",25,104.0)
    var reza = Manager("Reza",42,120.0)
    var farhad = Manager("Farhad",34,120.0)
    val sama = Clerk("Sama" , 26 , 110.0)
    val hours= arrayListOf(140.0,150.0,130.0,180.0)
    val sara = Customer("sara",22,Gender.Female)
    val maryam = Customer("maryam" , 30 , Gender.Female)
    val employeeList = arrayListOf<Employee>()
    fun printToString(){
        employeeList.addAll(arrayOf(ali,reza,farhad,sama))
        employeeList.forEach { println(it) }
    }
    fun printTotalPayment(){
        var totalPayment =0.0
//        employeeList.addAll(arrayOf(ali,reza,farhad,sama))
        for (i in 0 until employeeList.size-1){
            totalPayment += employeeList[i].salary(hours[i])
        }
        println("totalPayment = $totalPayment")
    }

}
