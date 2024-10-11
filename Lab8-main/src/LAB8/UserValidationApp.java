package LAB8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidationApp {

    // Constants for validation
    private static final int MIN_USERNAME_LENGTH = 3;
    private static final int MAX_USERNAME_LENGTH = 15;
    private static final String SPECIAL_CHAR_REGEX = "[!@#$%^&*(),.?\":{}|<>]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate user inputs
        try {
            validateUser(username, password);
            System.out.println("User validation successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }

    /**
     * Validates the username and password based on defined rules.
     *
     * @param username the username to validate
     * @param password the password to validate
     * @throws IllegalArgumentException if validation fails
     */
    public static void validateUser(String username, String password) {
        // Validate username length
        if (username.length() < MIN_USERNAME_LENGTH || username.length() > MAX_USERNAME_LENGTH) {
            throw new IllegalArgumentException("Username must be between " + MIN_USERNAME_LENGTH + " and " + MAX_USERNAME_LENGTH + " characters.");
        }

        // Validate if the password contains special characters
        if (!containsSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must contain at least one special character.");
        }

        // Check for empty strings
        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty.");
        }

        // If all validations pass, you can proceed with user processing
        // Example: Save user to the database (not implemented here)
    }

    /**
     * Checks if the given password contains special characters.
     *
     * @param password the password to check
     * @return true if it contains special characters, false otherwise
     */
    private static boolean containsSpecialCharacter(String password) {
        Pattern pattern = Pattern.compile(SPECIAL_CHAR_REGEX);
        return pattern.matcher(password).find();
    }
}
