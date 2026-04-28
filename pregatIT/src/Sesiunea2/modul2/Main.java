package Sesiunea2.modul2;

public class Main {
    public static void main(String[] args){
        BankAccount regularAccount = new BankAccount("Ana Popescu", "ACC 001", 100000);
        SavingsAccount savingsAccount = new SavingsAccount(regularAccount.getOwner(), regularAccount.getAccountNumber(),
                regularAccount.getBalance(), 5);

        regularAccount.deposit(500);
        regularAccount.displayInfo();

    }
}
