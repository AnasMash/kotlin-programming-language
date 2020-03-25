class BTkhara{
    var type:String? = null
    var yearBuilt:Int? = null
    var price:Double? = null
    var owner:String? = null

    fun BTkhara2(type2:String,yearBuilt2:Int,price2:Double,owner2:String){

        print("BTS is ")
        print(type2 + yearBuilt2 + price2 + owner2)

    }

}

fun main(args:Array<String>){

    BTkhara().BTkhara2("أسوأ فرقة في العالم",2013, 0.5,"Stool")

}