import kotlin.system.exitProcess

// Interface classes = that classes have methods without bodies

    interface Inputhandler{
        fun clicked()
        fun doubleClick(test:String)

    }
    class Phone:Inputhandler{
        override fun clicked() {
        println("clicked")
        }

        override fun doubleClick(test: String) {
           println("doubleClick")
            println(test)
        }

    }

fun main() {
    var test = Phone()
    test.clicked()
    test.doubleClick("Anas")
}