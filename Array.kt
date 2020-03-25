fun main(args: Array<String>) {

    var myArray = Array<Double>(4) { 2.1 }
    myArray[0] = 21.3//1
    myArray[1] = 22.4//2
    myArray[2] = 23.5//3
    myArray[3] = 24.6//4
    myArray[4] = 233.2
//    var myarray2 = arrayOf(123,124,125,126)
//    printing objects

    for (element in myArray){
//        println(element)
        }
// printing Items inside of the array via Index
    for (Index in 0..myArray.size-1) {
        println(myArray[Index])
    }
}