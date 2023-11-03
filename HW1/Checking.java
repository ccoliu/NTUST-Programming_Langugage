
public class Checking extends BankAccount {
    int TempDay = 0;

    Checking(String n, double m)
    {
        super(n,m);
        this.name = n;
        this.money = m;
    }
    void withdraw(int amount) throws AccountBalanceNotEnough {
        if (this.money - amount < 1000) {
            throw new AccountBalanceNotEnough("Not enough balance! Minimum money in account: 1000");
        }
        this.money -= amount;
    }
    void compute_interest(int day)
    {
        double decentInterest = interest / 365;
        this.money = this.money * (1 + (day * decentInterest));
        TempDay += day;
    }
}
