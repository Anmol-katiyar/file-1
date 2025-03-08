import java.util.Scanner;

class ATM {
    private float balance = 0.0f;  
    private final int pin = 4444;
    private final Scanner sc = new Scanner(System.in);  

    
    public void checkPin() {
        while (true) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == pin) {
                menu();
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
            
        }
    }

   
    public void menu() {
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw Balance");
            System.out.println("3: Deposit Balance");
            System.out.println("4: Exit");
            
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawBalance();
                    break;
                case 3:
                    depositBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close(); // Closing scanner before exiting
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Check the current balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Withdraw money
    public void withdrawBalance() {
        System.out.print("Enter the amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }

    // Deposit money
    public void depositBalance() {
        System.out.print("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }
}

public class ATM20 {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
