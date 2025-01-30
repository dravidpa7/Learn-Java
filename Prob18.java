import java.util.Scanner;
class bank{
    private int balance = 1000;
    int getBalance(){
        if (balance==0){
            System.out.println("Your balance is Rs.0");
            return balance;
        }
        else{
            return balance;
        }     
    }

    int deposit(int a){
        balance = a+balance;
        return balance;
    }

    int withdraw(int b){
        if(balance>=b && balance>0){
            balance = balance-b;
            return balance;        
        }
        else{
            System.out.println("unable to withdraw amount, enter amount less than"+balance);
            return balance;       
        }
    }
} 

public class Prob18{
    public static void main (String[] args){
        bank obj = new bank();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    System.out.println("New balance: " + obj.deposit(depositAmount));
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    System.out.println("New balance: " + obj.withdraw(withdrawAmount));
                    break;
                case 3:
                    System.out.println("Your balance: " + obj.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}