package io.github.julioamorim.model

class BankAccount {

    private var holder: String = ""
    private var accountNumber: Int = 0
    private var balance: Double = 0.0


    fun displayBalance() {
        println(holder + " - " + balance)
    }

    fun cashDeposit(value: Double) {
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

    fun getHolder(): String {
        return holder
    }

    fun setHolder(holder: String) {
        this.holder = holder
    }

    fun getAccountNumber(): Int {
        return accountNumber
    }

    fun setAccountNumber(accountNumber: Int) {
        this.accountNumber = accountNumber
    }

    fun getBalance(): Double {
        return balance
    }

    fun setBalance(balance: Double) {
        this.balance = balance
    }
}