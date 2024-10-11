package LAB8;

public class Calculator {
    
    public int addition(int a, int b) {
        return a + b;
    }

    
    public int multiplication(int a, int b) {
        return a * b;
    }

    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        
        int sum = calculator.addition(5, 3);
        System.out.println("Addition: 5 + 3 = " + sum);

        
        int product = calculator.multiplication(5, 3);
        System.out.println("Multiplication: 5 * 3 = " + product);
    }
}
