fun main() {
    println(binaryToDecimal("11001"))
    println(decimalToBinary(439))

}
fun binaryToDecimal(binary:String):Int{
    return binary.toInt(2)
}
fun decimalToBinary(number: Int): String {
    return Integer.toBinaryString(number)
}