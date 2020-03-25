// overload functions

class animal(){

    fun printall(name:String,age:Int){

        println(name + age)

    }

    fun printall(name: String){
        println(name)

    }

    fun printall(){

        println("Test")

    }
}

fun main(){
    var lion = animal()
    lion.printall("Anas",123)
}