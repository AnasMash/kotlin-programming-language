class myhomes{
    var type:String?=null
    var price:Double?=null
    var yearBuilt:Int?=null
    var owner:String?=null
 constructor(type:String){
        this.type = type
        this.price = 123.32
        this.yearBuilt = 1986
        this.owner = "a"
    println(type)
 }

//    init {
//        this.type = type1
//        this.price = price1
//        this.yearBuilt = yearBuilt1
//        this.owner = owner1
//
//    }

}

fun main(args:Array<String>) {

//   var home1 = myhomes("3 bed",12000.9,1975,"Anas")
//    var home2 = myhomes("3 bed",12000.9,1975,"Mash")
    var home3 = myhomes("Anas")

}