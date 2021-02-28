/*
Bank Account
 */
package bankaccount;

public class BankAccount {
    
    private double balance;
    
    /*
    Constructs a bank account with zero balance
    */
    public BankAccount(){
        balance = 0;
    }
            
    /*
    Constructs a bank account with a given balance.
    @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
            
    /*
    Deposits money into this account
    @param amount the amount to deposit
    */
    public void depost(double amount){
        balance = balance + amount;
    }
            
    /*
    Makes a withdrawal from this account, or changes a penalty if sufficient
    funds are not available.
    @param amount the amount of the withdrawal
    */
    public void withdraw(double amount){
        final double PENALTY = 10;
        if(amount > balance){
            balance = balance - PENALTY;
        }else{
            balance = balance - amount;
        }
    }
            
    /*
    Adds interest to this account
    @param rate the interest in percent
    */
    public void addInterest(double rate){
        double amount = balance * rate / 100;
        balance = balance + amount;
    }
            
    /*
    Gets the current balance of the account
    @return the current balance
    */
    public double getBalance(){
        return balance;
    }
}
