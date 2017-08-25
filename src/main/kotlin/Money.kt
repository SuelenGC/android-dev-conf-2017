package main.kotlin

import main.java.JavaMoney
import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String) {
    operator fun plus(money: Money) =
            if (currency == money.currency) {
                Money(amount + money.amount, currency)
            } else {
                throw IllegalArgumentException("Bla bla bla")
            }
}

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
    "U$" -> money
    "R$" -> Money(money.amount / BigDecimal(3.50), "U$")
    else -> throw IllegalArgumentException("Ixi deu ruim!")
}

fun BigDecimal.percent(percentage: Int) = this.multiply(java.math.BigDecimal(percentage)).divide(BigDecimal(100))

infix fun Int.percentOf(money: Money) = money.amount.multiply(BigDecimal(this)).divide(BigDecimal(100));


fun javaMoney(money: JavaMoney?) {
    if (money != null) {
        println("${money.amount} <<")
    }

    // ou

    println("${money?.amount} <<<<")

    // ou se quiser dar um tiro no pé
    // println("${money!!.amount} <<<<")
}

fun main(args: Array<String>) {

    val tickets = Money(100.bd, "R$")
    val popcorn = tickets.copy(25.bd, "R$")

    val costs = tickets + popcorn
    println(costs)


    val x : Money = Money(100.bd, "U$")
    // x = null

    val big = BigDecimal(100)
    // big.percent ???

    println(big.percent(7))

    println(50.percentOf(popcorn))

    // Para corrigir o erro que vai aparecer:
    // Alt + Enter
    // Add infix
    println(50 percentOf popcorn)

    val long = 100L
    val bd = 100.bd

    if (tickets != popcorn) {
        println("They are differents!")
    }

    if (tickets !== popcorn) {
        println("Ref are differents!")
    }

    sendPayment(message = "Use com parcimonia!", money = tickets)

    val javaMoney = JavaMoney(BigDecimal(100), "R$")

    println(javaMoney.amount)

    main.kotlin.javaMoney(javaMoney)
    main.kotlin.javaMoney(null)


    val users : MutableList<User> = mutableListOf<User>()
    users.add(0, User("Suelen", "suelengcarvalho@gmail.com"))
    users.add(1, User("David", "davidrobert@gmail.com"))
    users.add(2, User("AA", "blahblah@test.com"))

    val usersOrdered = users.filter { it.email.endsWith("gmail.com") }.sortedBy { it. nome }

    println(usersOrdered)



    val values = generateSequence(1) {
        it * 10
    }


    values.take(10).forEach { println(it) }
}

data class User(val nome: String, val email: String)

private val Int.bd: BigDecimal
    get() = BigDecimal(this)

