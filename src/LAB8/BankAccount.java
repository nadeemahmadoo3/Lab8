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

    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount myAccount = new BankAccount("John Doe", 500.0);

        // Display the current balance
        System.out.println("Current balance: $" + myAccount.accountBalance());
    }
}
