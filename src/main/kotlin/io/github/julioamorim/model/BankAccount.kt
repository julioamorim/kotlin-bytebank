package io.github.julioamorim.model

class BankAccount {

    var holder: String = ""
    var accountNumber: Int = 0
    var balance: Double = 0.0


    fun displayBalance() {
        println(holder + " - " + balance)
    }

    fun cashDeposit(value: Double) {
        this.balance += value
    }

    fun withDraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

    fun cashTranfer(valueTotranfer: Double, targetAccount: BankAccount) {

        if (this.balance < valueTotranfer)
            println("Account from ${this.holder} nas not money suficient")
        else {
            println("tranfering cash")
            targetAccount.balance += valueTotranfer
            this.balance -= valueTotranfer
        }
    }

}