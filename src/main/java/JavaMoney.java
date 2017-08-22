package main.java;

import main.kotlin.Money;

public class JavaMoney {

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

    private int amount;
    private String currency;
    private int x = 10;

    public int getAmount() {
        return amount * 2;
    }

    public String getCurrency() {
        return currency;
    }

    public JavaMoney(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static void main(String[] args) {
        Money money = new Money(100, "R$");
        money.getAmount();


    }

}
