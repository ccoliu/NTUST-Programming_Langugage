public class Saving extends BankAccount {
    int Tempmonth = 0;
    Saving(String n, int m)
    {
        super(n, m);
        this.name = n;
        this.money = m;
    }
    void deposit(int money)
    {
        if (Tempmonth > 3) this.money -= 1;
        this.money += money;
    }
    void withdraw(int money)
    {
        if (Tempmonth > 3) this.money -= 1;
        this.money -= money;
    }
    void compute_interest(int month)
    {
        double decentInterest = interest / 12;
        this.money = this.money * (1 + (month * decentInterest));
        Tempmonth += month;
    }
}
