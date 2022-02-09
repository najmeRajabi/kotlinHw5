fun main() {

    // BigO = O 1
    val n =5
    println("Your input is:$n")

    //....O n
    for (i in 0 until n){
        println("Your input is:$i")
    }

    //...O n^2....
    for (i in 1..n){
        for (j in 1..n){
            println("Your input is:$i and $j")
        }
    }

    //..O n^2.............
    for (i in 1..factorial(n)){
        println("Your input is:$i")
    }


}
fun factorial(n:Int):Int{
    var result=1
    for (i in n downTo 1)
        result *= i
    return result
}