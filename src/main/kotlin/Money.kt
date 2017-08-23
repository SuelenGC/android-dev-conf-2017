package main.kotlin

import main.java.JavaMoney
import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String)

fun sendPayment(money: Money, message: String = "") {
    println("Sending ${money.amount} - ${message}")
}

fun sum(x: Int, y: Int) = x + y

fun convertToDollars(money: Money): Money {
    when (money.currency) {
        "U$" -> return money
        "R$" -> return Money(money.amount * BigDecimal(3.50), "U$")
        else -> throw IllegalArgumentException("Ixi deu ruim!")
    }
}

fun convertToDollars2(money: Money): Money {
    return when (money.currency) {
        "U$" -> money
        "R$" -> Money(money.amount / BigDecimal(3.50), "U$")
        else -> throw IllegalArgumentException("Ixi deu ruim!")
    }
}

fun convertToDollars3(money: Money) = when (money.currency) {
    "$" -> money
    "R$" -> Money(money.amount / BigDecimal(3.50), "U$")
    else -> throw IllegalArgumentException("Ixi deu ruim!")
}

fun BigDecimal.percent(percentage: Int) = this.multiply(java.math.BigDecimal(percentage)).divide(BigDecimal(100))
fun main(args: Array<String>) {

    val tickets = Money(BigDecimal(100), "R$")
    val popcorn = tickets.copy(BigDecimal(100), "R$")

    val bd = BigDecimal(100)
    // bd.percent ???

    println(bd.percent(7))


    if (tickets != popcorn) {
        println("They are differents!")
    }

    sendPayment(message = "Use com parcimonia!", money = tickets)

    val javaMoney = JavaMoney(BigDecimal(100), "R$")

    println(javaMoney.amount)

}