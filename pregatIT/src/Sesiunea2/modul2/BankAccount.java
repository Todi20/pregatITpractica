package Sesiunea2.modul2;

import java.sql.SQLOutput;

public class BankAccount {
    private String owner;
    private String AccountNumber;
    protected double balance;

    public BankAccount(String owner, String AccountNumber, double balance){
        this.owner = owner;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
   public String getOwner(){
        return owner;
   }

   public String getAccountNumber(){
        return AccountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Amount must be pozitive");
            return;
        }

        balance = balance + amount; //balance++ amount
        System.out.println(amount + " depozited succesfully");

    }

    public void withdraw(int amount){
     if(amount <= 0)
     {
         System.out.println("Amount must be pozitive");
         return;
     }
     if(amount > balance){
         System.out.println("Not enough money");
         return;
     }

     balance -= amount;
        System.out.println(amount + " withdrawal succesfully");

    }
    public void displayInfo(){
        System.out.println("Owner " + owner);
        System.out.println("Account number " + AccountNumber);
        System.out.println("Balance " + balance);

    }


}
