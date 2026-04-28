package Sesiunea2.modul2;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private final double minimumBalance = 100;

    public SavingsAccount(String owner, String AccountNumber, double balance, double interestRate){
        super(owner, AccountNumber, balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }

    public void applyInterestRate(){
        double interest = balance * interestRate / 100;

        balance += interest;

        System.out.println("Interest " + interestRate + " applied. Your new balance " + balance);


    }

    @Override
    public void withdraw(int amount){
        if(amount <= 0){
            System.out.println("Amount must be pozitive");
            return;

        }

    if (balance - amount < minimumBalance){

        System.out.println("Minimum balance less than " + minimumBalance);
        return;

    }

    balance -= amount;
        System.out.println(amount + " withdraw from saving account.");

    }

    @Override
    public void displayInfo() {
     super.displayInfo();
        System.out.println("Interest rate " + interestRate );
    }



}
