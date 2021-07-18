fun main() {
    println("Welcome to Bytebank!")
    val titular: String = "Júlio" // variable with val dont change de type
    val numeroConta: Int = 1000
    var saldoConta: Double = 0.0
    saldoConta = 100 + 2.00
    saldoConta += 100.00

    println("Titular $titular") // with string template, you dont need concatenate with + operator
    println("número da conta $numeroConta")
    println("Saldo da conta $saldoConta \n")

    testConditions(saldoConta)
    count(234, 999)
    countDownTo(100, 0)
}

fun testConditions(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("Conta é positiva")
        saldoConta == 0.0 -> println("Conta esta zerada")
        else -> println("Conta negativa")
    }
}

fun count(numberToCount: Int, finalNumberCount: Int) {
    for (i in numberToCount..finalNumberCount)
        println(i)
}

fun countDownTo(maxNubmer: Int, minNumber: Int) {
    for (i in maxNubmer downTo minNumber step 2)
        println("Number $i")
}