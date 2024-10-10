package LAB8;
public class BankAccount {
    private String accountHolderName; // Name of the account holder
    private double balance; // Current balance of the account

    // Constructor to initialize the bank account
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance >= 0 ? initialBalance : 0; // Ensure the initial balance is non-negative
    }

    /**
     * Method to get the current balance of the account.
     *
     * @return the current balance
     */
    public double accountBalance() {
        return balance; // Retrieve the balance from the class variable
    }

    /**
     * Method to deposit money into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Update balance
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Method to withdraw money from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Update balance
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Check your balance or the amount.");
        }
    }

    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount myAccount = new BankAccount("John Doe", 500.0);

        // Display the current balance
        System.out.println("Current balance: $" + myAccount.accountBalance());

        // Deposit some money
        myAccount.deposit(150.0);
        System.out.println("Current balance after deposit: $" + myAccount.accountBalance());

        // Withdraw some money
        myAccount.withdraw(200.0);
        System.out.println("Current balance after withdrawal: $" + myAccount.accountBalance());

        // Attempt to withdraw more than the balance
        myAccount.withdraw(600.0);
    }
}
