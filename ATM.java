import java.util.*;

public class ATM {
    public static int balance = 10000;
    public static Scanner sc = new Scanner(System.in);

    public static void displayBalance() {
        System.out.println("\nEnter your 4-digit secret PIN: ");
        int pin = sc.nextInt();
        System.out.println("Your current balance is: " + balance);
    }

    public static void withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        int withdrawAmount = sc.nextInt();
        System.out.print("\nEnter your 4-digit secret PIN: ");
        int pin = sc.nextInt(); // added to store the PIN
        if (withdrawAmount <= balance) {
            System.out.println("Transaction Successful.");
            System.out.println("Please Collect the cash & your card");
            System.out.println("Remaining Balance: " + (balance - withdrawAmount));
            balance -= withdrawAmount; // update the balance
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        int depositAmount = sc.nextInt();
        System.out.println("\n Deposited Successfully");
        System.out.println("Balance is: " + (balance + depositAmount));
        balance += depositAmount; // update the balance
    }

    public static void exit() {
        System.out.println("\nYou have Exited Successfully...");
    }

    public static void main(String args[]) {
        System.out.println("\n ** Welcome to the ATM! Please insert your card **");
        while (true) {
            System.out.println("\nSelect an Operation to Proceed with: ");
            System.out.println("1: Balance Inquiry");
            System.out.println("2: Withdraw Money");
            System.out.println("3: Deposit Money");
            System.out.println("4: Exit");
            System.out.println();
            System.out.print("Your Choice is: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    exit();
                    System.exit(0); // exit the program
                    break;
                default:
                    System.out.println("Incorrect Option !!! Please select carefully and correct option..");
            }
        }
    }
}