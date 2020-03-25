// Enum هي عبارة عن طريقة لجمع ثوابت لها علاقة ببعضها البعض في شيئ واحد

enum class gender(num1:Int,num2:Double) {
    MALE(12,2.6),
    FEMALE(13,4.2);
    var var1:Int? = null
    var var2:Double? = null

    init {
        this.var1 = num1
        this.var2 = num2
    }

}

fun main() {
    var var1 = gender.FEMALE.var1
    var var11 = gender.MALE.var2

    println(var1)
    println(var11)
}