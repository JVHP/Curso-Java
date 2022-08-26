package entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit, double loanLimit1) {
        super(number, holder, balance, loanLimit);
        this.loanLimit = loanLimit1;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            //deposit(amount - 10.0);
            balance += (amount - 10.0);
        }
    }
}
