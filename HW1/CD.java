public class CD extends BankAccount {
    int Tempmonth = 0;
    int constriant;
    CD(String n, double m,int c)
    {
        super(n,m);
        this.name = n;
        this.money = m;
        this.constriant = c;
    }
    void deposit(int money) throws CantDeposit {
        if (Tempmonth < constriant)
        {
            throw new CantDeposit("You can't save your money for now! Due month: " + this.constriant + ", Current Month: " + this.Tempmonth);
        }
        this.money += money;
    }
    void withdraw(int money)
    {
        if (Tempmonth <= constriant)
        {
            this.money -= 250;
        }
        this.money -= money;
    }
    void compute_interest(int month)
    {
        double decentInterest = interest / 12;
        this.money = this.money * (1 + (month * decentInterest));
        Tempmonth += month;
    }
}
