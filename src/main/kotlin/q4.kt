fun main() {
    val list= arrayListOf(1,2,3,4,5,6)
    PrintClass().also {
        it.print(list)
    }


}
class PrintClass{}
fun <T> PrintClass.print(list:ArrayList<T>){
    list.forEach{ println(it) }
}