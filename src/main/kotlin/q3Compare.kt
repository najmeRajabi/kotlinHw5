import kotlin.math.max

fun main() {
    var compare =CompareTowThing(5.5,2.3)
    println(compare.compare())

}
class CompareTowThing<T>(val item:T,val item2: T){
    fun compare(): Any {
        var result=if (item is Int && item2 is Int){
            maxOf(item as Int,item2 as Int)
        }else if (item is Double && item2 is Double){
            max(item , item2)
        }else if (item is Long && item2 is Long){
            max(item , item2)
        }else if (item is Float && item2 is Float){
            max(item , item2)
        }else if (item is Short && item2 is Short){
            maxOf(item , item2)
        }else {
            if (item is Byte && item2 is Byte){
                maxOf(item , item2)
            }else{
                "this type not able to compare"
            }
        }
        return result
    }
}