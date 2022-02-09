fun main() {
    val list= arrayListOf(1,2,3,4,5,6)
    val printClass =PrintClass()
    printClass.print(list)


}
class PrintClass{}
fun <T> PrintClass.print(list:ArrayList<T>){
    list.forEach{ println(it) }
}