fun main(args: Array<String>) {
    var myArrayList = ArrayList<String>()

    myArrayList.add("Anas")
    myArrayList.add("Mash")
    myArrayList.set(0,"Sarah")
    myArrayList.remove("Mash")
    myArrayList.removeAt(0)
//    println(myArrayList[0])

    for (element in myArrayList){
//        println(element)
    }

    for (Index in 0..myArrayList.size-1){
        println(myArrayList[Index])
    }
}