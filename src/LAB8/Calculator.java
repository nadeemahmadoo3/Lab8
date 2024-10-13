package LAB8;

public class Calculator {

    // Addition method with input validation
    public int addition(int a, int b) {
        if (isValidInput(a) && isValidInput(b)) {
            return a + b;
        } else {
            System.out.println("Invalid input: both numbers must be non-negative integers.");
            return -1; // returning -1 to indicate invalid input
        }
    }

    // Multiplication method with input validation
    public int multiplication(int a, int b) {
        if (isValidInput(a) && isValidInput(b)) {
            return a * b;
        } else {
            System.out.println("Invalid input: both numbers must be non-negative integers.");
            return -1; // returning -1 to indicate invalid input
        }
    }

    // Method to check if input is non-negative
    private boolean isValidInput(int number) {
        return number >= 0;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test valid inputs
        int sum = calculator.addition(5, 3);
        if (sum != -1) {
            System.out.println("Addition: 5 + 3 = " + sum);
        }

        int product = calculator.multiplication(5, 3);
        if (product != -1) {
            System.out.println("Multiplication: 5 * 3 = " + product);
        }

        // Test invalid inputs
        int invalidSum = calculator.addition(-5, 3);
        if (invalidSum != -1) {
            System.out.println("Addition: -5 + 3 = " + invalidSum);
        }

        int invalidProduct = calculator.multiplication(5, -3);
        if (invalidProduct != -1) {
            System.out.println("Multiplication: 5 * -3 = " + invalidProduct);
        }
    }
}
