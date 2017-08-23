package main.java;

import main.kotlin.Money;

import java.math.BigDecimal;

public class JavaMoney {

    private BigDecimal amount;
    private String currency;
    private int x = 10;

    public JavaMoney(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static void main(String[] args) {
        Money money = new Money(new BigDecimal(100), "R$");
        money.getAmount();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "JavaMoney{" +
                "amount=" + amount +
                "currency=" + currency + "\n" +
                "}";
    }

    public BigDecimal getAmount() {
        return amount.multiply(new BigDecimal(2));
    }

    public String getCurrency() {
        return currency;
    }

}
