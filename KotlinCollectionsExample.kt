// arrayof ,listof , mutablelistof ,hashMapof
fun main(args: Array<String>) {
    var myArray = arrayOf(12, 13, 14, 15)
    // println(myArray[0])
    // for (a in myArray) println(a)

    var myArrayList = listOf<String>("Anas", "Mash")
    //println(myArrayList.get(0))
    for (List in myArrayList) println(List)

    var m = mutableListOf<String>("Anas", "Mash")
    m[0] = "Ahmed"
    println(m[0])

    var myhash = hashMapOf<Any,Any>(12 to 18 ,16 to 116 , 19 to "Anas")
    println(myhash.get(12))
    for (hash in myhash)    println(hash.value)

}
