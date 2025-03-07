package entities;

public class Account {
    private Integer number;
    private String holder;
    private double balance;

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }   

    public void deposit(double amount) {
        balance += amount;
    }
}
