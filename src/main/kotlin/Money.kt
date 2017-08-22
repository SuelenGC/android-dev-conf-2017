package main.kotlin

import main.java.JavaMoney

data class Money(val amount: Int, val currency: String)

fun sendPayment(money: Money, message: String = "") {
    println("Sending ${money.amount} - ${message}")
}

fun main(args: Array<String>) {
    val tickets = Money(100, "R$")
    val popcorn = tickets.copy(100, "R$")

    if (tickets != popcorn) {
        println("They are differents!")
    }

    sendPayment(message = "Use com parcimonia!", money = tickets)

    val javaMoney = JavaMoney(100, "R$")

    println(javaMoney.amount)

}