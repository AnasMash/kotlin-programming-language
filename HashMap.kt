fun main(args: Array<String>) {
    var hash = HashMap<Any,Any>()
    hash.put("Name" , "Anas")
    hash.put("Age" , 15)

    for (k in hash.keys) println(hash.get(k))

//    println (hash.get("age"))
}