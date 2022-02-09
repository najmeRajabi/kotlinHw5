fun main() {
    val list= arrayListOf(1,2,3,4,5,"6","salam")
    list.print()
}
fun <T> ArrayList<T>.print(){
    this.forEach{ println(it) }
}