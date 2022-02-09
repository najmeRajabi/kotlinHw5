fun main() {
    println(binaryToDecimal("11001"))
    println(convertBinaryToDecimal(11001))
    println(decimalToBinary(439))
    println(convertDecimalToBinary(439))

}
fun binaryToDecimal(binary:String):Int{
    return binary.toInt(2)
}
fun decimalToBinary(number: Int): String {
    return Integer.toBinaryString(number)
}

fun convertBinaryToDecimal(number: Long):Int{
    var number = number
    var mode :Long
    var i = 0
    var decimal =0

    while (number.toInt() != 0){
        mode = number%10
        number/= 10
        decimal += (mode * Math.pow(2.0,i.toDouble())).toInt()
        ++i
    }
    return decimal
}

fun convertDecimalToBinary(number: Int):Long{
    var number =number
    var binary:Long=0
    var mode :Int
    var i = 1

    while (number !=0){
        mode = number % 2
        number /= 2
        binary += (mode *i).toLong()
        i *= 10
    }
    return binary
}