fun main() {
    val list = arrayListOf(1,2,3,4,5)
    val number = 2
    list.slice(number)
    val list2 = arrayListOf("a","b","c","d","e","f","g")
    val n =3
    list2.slice(n)

}
fun <T> ArrayList<T>.slice( number: Int){
    var list1 = arrayListOf<T>()
    var list2 = arrayListOf<T>()
    if (this.size-1 > number){
        for (item in 0..number){
            list1 .add(this[item])
        }
        for (item in number+1 until this.size){
            list2.add(this[item])
        }
    }
    println("$this , $number ->  $list1 , $list2")
}