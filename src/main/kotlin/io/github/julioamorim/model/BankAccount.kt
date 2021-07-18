package io.github.julioamorim.model

class BankAccount {

    var holder: String = ""
    var accountNumber: Int = 0
    var balance: Double = 0.0
        private set


    fun displayBalance() {
        println(holder + " - " + balance)
    }

    fun cashDeposit(value: Double) {
        if (value > 0)
            this.balance += value
    }

    fun cashWithDraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

    fun cashTranfer(valueToTranfer: Double, targetAccount: BankAccount): Boolean {

        if (this.balance >= valueToTranfer) {
            println("Cash transfered")
            targetAccount.cashDeposit(valueToTranfer)
            this.balance -= valueToTranfer
            return true
        }
        return false
    }

}