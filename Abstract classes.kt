import java.awt.Shape

//Abstract classes

abstract class shape{
    fun test(){
        println("my abstract")

    }
    abstract fun draw()
    abstract fun resize()


}
class circle:shape(){
    override fun draw() {
        println("draw circle")

    }

    override fun resize() {

    }

}


fun main() {
    var cir = circle()
    cir.draw()
    cir.test()

}