class BankAccount {
    // Attributes
    String Name;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String Name, String accountNumber, double balance) {
        this.Name = Name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal of $" + amount + " failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        }
    }

    // Method to show account details
    void showDetails() {
        System.out.println("Account Holder: " + Name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }
}

public class QnoTwo {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Alice Smith", "123456789", 1000.0);

        // Show initial details
        account.showDetails();

        // Deposit and withdraw operations
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500); // This will show an insufficient balance message
    }
}
