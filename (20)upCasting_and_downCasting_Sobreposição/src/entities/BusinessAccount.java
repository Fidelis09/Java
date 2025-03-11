package entities;



public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void Loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}