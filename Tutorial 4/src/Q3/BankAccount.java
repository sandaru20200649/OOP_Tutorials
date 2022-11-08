package Q3;

public class BankAccount implements Comparable<BankAccount>{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int compareTo(BankAccount other) {
        if (this.balance > other.getBalance())
            return 0;
        else if (this.balance > other.getBalance())
            return 1;
        else
            return 0;
    }
}
