
var nameGlobal:String? = null//global

fun main(args:Array<String>) {
    var name = "anas"//local var
    nameGlobal="ahmed"
    print(nameGlobal)
    myName()
}
fun myName(){
    var name = "Mash" // local
    nameGlobal="mohammed"
    println(nameGlobal)

}