package main.kotlin


import android.dev.conf.JavaMoney
import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String)

fun sendPayment(money: Money, message: String = "") {
    println("Enviando grana ${money.amount} " + message)
}

fun sum(x: Int, y: Int) = x + y

fun convertToDollar(money: Money) = when (money.currency) {
    "U$" -> money
    "R$" -> Money(money.amount * BigDecimal(3.14), "U$")
    else -> throw IllegalArgumentException("Deu ruim!")
}

fun main(args: Array<String>) {
    val propina = Money(BigDecimal(100), "R$")
    val caixa2 = Money(BigDecimal(100), "R$")

    if (propina !== caixa2) {
        println("Não são iguais!!")
    }

    val javaMoney = JavaMoney(100, "R$")
    println(javaMoney.amount)

    sendPayment(message = "propina", money = propina);

    println(convertToDollar(propina))

    val bd = BigDecimal(100)

//    bd.percent(7)


}