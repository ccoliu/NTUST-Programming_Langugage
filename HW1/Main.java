

public class Main {
    public static void main(String[] args) {

        //Checking
        Checking checkAccount = new Checking("CheckAccount", 1000);
        System.out.println("Account name: " + checkAccount.Name());
        try {
            checkAccount.withdraw(1);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            checkAccount.deposit(500);
            checkAccount.withdraw(1);
            checkAccount.compute_interest(100);
        }  catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The " + checkAccount.Name() + " balance is now: " + checkAccount.balance());

        //Saving
        Saving saveAccount = new Saving("SaveAccount", 1000);
        saveAccount.compute_interest(4);
        System.out.println("The " + saveAccount.Name() + " balance is now: " + saveAccount.balance());
        try {
            saveAccount.withdraw(100);
            saveAccount.deposit(200);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The " + saveAccount.Name() + " balance is now: " + saveAccount.balance());

        //CD
        CD CDAccount = new CD("CDAccount", 1000, 12);
        System.out.println("Account name: " + CDAccount.Name());
        try {
            CDAccount.deposit(1000);
        }  catch (Exception e)
        {
            System.out.println(e);
        }
        CDAccount.withdraw(50);
        System.out.println("The " + CDAccount.Name() + " balance is now: " + CDAccount.balance());
        CDAccount.compute_interest(12);
        System.out.println("The " + CDAccount.Name() + " balance is now: " + CDAccount.balance());
        try {
            CDAccount.deposit(1000);
        }  catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The " + CDAccount.Name() + " balance is now: " + CDAccount.balance());

        //Loan
        Loan LoanAccount = new Loan("LoanAccount",1000);
        System.out.println("Account name: " + LoanAccount.Name());
        try {
            LoanAccount.withdraw(1000);
        }  catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The " + LoanAccount.Name() + " balance is now: " + LoanAccount.balance());
         try {
            LoanAccount.deposit(100);
        }  catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The " + LoanAccount.Name() + " balance is now: " + LoanAccount.balance());
    }
}