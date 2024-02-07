// Programmers: Ayana Thompson and Miles Hall
// Due Date: 2/11/24
// Purpose: Design and implement a new interface for a new generation of ATMs

// Imports
import java.util.Scanner;

public class Lab3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double deposit = 0;
        double withdraw = 0;
        double balance = 212.90;

        System.out.println("Hello, what is your name?");
        String name = scan.nextLine();

        System.out.println(name + " it is nice to meet you!");
        System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
        String selection = scan.nextLine().toUpperCase();

        while(!"L".equals(selection)){
            if (selection.equals("D")){
                System.out.println("Enter the amount you would like to deposit: ");
                deposit = scan.nextDouble();
                scan.nextLine();
                balance += deposit;
                System.out.println("Your new balance is: " + balance);
                System.out.println("Enter what you would like to do next: ");
                System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
                selection = scan.nextLine().toUpperCase();
            } else if (selection.equals("W")){
                System.out.println("Enter the amount you would like to withdraw: ");
                withdraw = scan.nextDouble();
                scan.nextLine();
                if (balance >= withdraw){
                    balance -= withdraw;
                    System.out.println("Your new balance is: " + balance);
                    System.out.println("Enter what you would like to do next: ");
                    System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
                    selection = scan.nextLine().toUpperCase();
                } else{
                    System.out.println("Insufficient funds, try again");
                    System.out.println("Enter the amount you would like to withdraw: ");
                    withdraw = scan.nextDouble();
                    scan.nextLine();
                    if (balance >= withdraw){
                        balance -= withdraw;
                        System.out.println("Your new balance is: " + balance);
                        System.out.println("Enter what you would like to do next: ");
                        System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
                        selection = scan.nextLine().toUpperCase();
                        scan.nextLine();
                    }
                }
            } else if (selection.equals("B")){
                System.out.println("Your balance is: $" + balance);
                System.out.println("Enter what you would like to do next: ");
                System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
                selection = scan.nextLine().toUpperCase();
            } else if (selection.equals("L")){
                System.out.println("Would you like a receipt printed or emailed?");
                System.out.println("Total amount withdrawn: " + withdraw);
                System.out.println("Total amount deposited: " + deposit);
                System.out.println("Thank you for using our ATM!");
                System.out.println("Please take your receipt or check your email");
            } else {
                System.out.println("Invaild input");
                System.out.println("To deposit money enter [D], to withdraw [W], to check balance [B], to leave [L]: ");
                selection = scan.nextLine().toUpperCase();
                scan.nextLine();
            }
        }
        System.out.println("Would you like a receipt printed or emailed?");
        System.out.println("Total amount withdrawn: " + withdraw);
        System.out.println("Total amount deposited: " + deposit);
        System.out.println("Thank you for using our ATM!");
        System.out.println("Please take your receipt or check your email");
    }
}