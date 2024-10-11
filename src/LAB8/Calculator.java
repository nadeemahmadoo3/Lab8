package LAB8;

public class Calculator {
    
    /**
     * Adds two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int addition(int a, int b) {
        return a + b;
    }

    /**
     * Multiplies two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiplication(int a, int b) {
        return a * b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    public int subtraction(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second.
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a / b
     * @throws ArithmeticException if b is zero
     */
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Perform addition
        int sum = calculator.addition(5, 3);
        System.out.println("Addition: 5 + 3 = " + sum);

        // Perform multiplication
        int product = calculator.multiplication(5, 3);
        System.out.println("Multiplication: 5 * 3 = " + product);

        // Perform subtraction
        int difference = calculator.subtraction(5, 3);
        System.out.println("Subtraction: 5 - 3 = " + difference);

        // Perform division
        try {
            double quotient = calculator.division(5, 0);
            System.out.println("Division: 5 / 0 = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
