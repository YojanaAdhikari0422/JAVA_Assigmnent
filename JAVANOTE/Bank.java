import java.util.*;

class Bank{
    public static void main(String args[]){
    System.out.println("Enter if you want to deposit or withdraw");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Enter the amount");
    double amt = sc.nextDouble();
    ATM atm=new ATM();
    atm.performTransaction(str,amt);
    System.out.println("This line is executed " );
    }
}

class BankAccount{
    int accountNumber;
    double balance=1000;
    void withdraw(double amount){
        System.out.println("The available balance is : " + balance);
        System.out.println("The amount to be withdrawn is : " + amount);
        if(balance<amount){
            System.out.println("The balance is insuffecient " );
        }
        else{
        
            balance=balance-amount;
            System.out.println("The available balance after the withdraw is : " + balance);
        }
  }
           void deposit(double amount){
            System.out.println("The amount to be withdrawn is : " + amount);
            balance=balance + amount;
            System.out.println("The available balance after the deposit is : " + balance);
        
        }
}
    
 class ATM{
    void performTransaction(String type,double amount){
        if(type == "deposit"){
            BankAccount Bank = new BankAccount();
            Bank.deposit(amount);
        }
        else if(type == "withdrawn"){
        BankAccount Bank = new BankAccount();
        Bank.withdraw(amount);  
        }
    }
}


