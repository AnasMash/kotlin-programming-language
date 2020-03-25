// Hirarchical inheritance الوراثة الهرمية

open class A1() {
    var name = "Anas"

    fun printname(){

        println(name)

    }
}

open class B2() : A1() {

}

class C3:B2 (){

}

fun main() {
    var inh = C3()
    inh.name = "Mash" //ملاحظة::: تحولت لMash ﻷنه متغير
    inh.printname()
}