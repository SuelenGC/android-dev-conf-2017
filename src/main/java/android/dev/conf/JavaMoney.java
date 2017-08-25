package android.dev.conf;

public class JavaMoney {

    private int amount;
    private String currency;
    private int x = 10;

    public JavaMoney(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
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

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

}
