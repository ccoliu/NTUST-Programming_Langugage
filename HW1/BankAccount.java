
public class BankAccount {
    String name;
    double money;
    double interest = .12;

    BankAccount(String n, double m)
    {
        this.name = n;
        this.money = m;
    }

    String Name() 
    { 
        return name; 
    }
    void deposit(int amount) throws CantDeposit
    {
        money += amount;
    }
    void withdraw(int amount) throws AccountBalanceNotEnough
    {
        money -= amount;
    }
    double balance()
    {
        return money;
    }
    void compute_interest()
    {
        money = money * (1.00 + interest);
    }
}