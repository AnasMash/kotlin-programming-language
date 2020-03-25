// generic class
class myclass<T>{
    var name:T? = null
    var age :T? = null
    fun print(){
        println(name)
        println(age)
    }
}
fun main() {
    var o = myclass<Int>()
    o.name = 12
    o.age =  23
    o.print()




}