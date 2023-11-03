public class Loan extends BankAccount {
    Loan(String n, double m)
    {
        super(n,m);
        this.name = n;
        this.money = -m;
    }
    void withdraw(int money) throws AccountBalanceNotEnough {
        throw new AccountBalanceNotEnough("You can't loan more money!");
    }
}
