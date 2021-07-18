package io.github.julioamorim.model

class BankAccount {

    var holder: String = ""
    var accountNumber: Int = 0
    var balance: Double = 0.0


    fun displayBalance() {
        println(holder + " - " + balance)
    }

    fun cashDeposit(value: Double) {
        this.balance += value;
    }

}