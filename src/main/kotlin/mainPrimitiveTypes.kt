fun main() {

    val anInt = 3
    val anotherInt = 2147483647
    val aLong = 2147483648
    val aBetterLong = 2147483649L
    val aSmallLong = 3L
    val aShort: Short = 32767
    val anotherShort = 1024.toShort()
    val aByte: Byte = 65
    val anotherByte = (-32).toByte()

    println(7 / 3)            // Prints 2
    println(7 / 3.0)          // Prints 2.3333333333333335
    val x = 3
    println(7 / x)            // Prints 2
    println(7 / x.toDouble()) // Prints 2.3333333333333335


    //INTEGERS
    val mostPositive = 2147483647
    val mostNegative = -2147483648
    println(mostPositive + 1)
    println(-mostNegative)

}