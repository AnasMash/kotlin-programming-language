class myhome(type1:String, price1:Double, yearBuilt1:Int, owner1:String){
    var type:String?=null
    var price:Double?=null
    var yearBuilt:Int?=null
    var owner:String?=null

    init {
        this.type = type1
        this.price = price1
        this.yearBuilt = yearBuilt1
        this.owner = owner1

    }

}

fun main(args:Array<String>) {

   var home1 = myhome("3 bed",12000.9,1975,"Anas")
    var home2 = myhome("3 bed",12000.9,1975,"Mash")
    println(home1.owner)
    println(home2.owner)

}