package LAB8;
import javax.swing.*;
import java.awt.*;

public class MyDictionaryApp {

    private JButton[] buttons; // Array of buttons for demonstration
    private JFrame frame;

    public MyDictionaryApp() {
        frame = new JFrame("Dictionary App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        createButtons();
        designUI(); // Call to designUI method
        frame.setVisible(true);
    }

    private void createButtons() {
        // Sample button creation
        buttons = new JButton[3];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            frame.add(buttons[i]);
        }
    }

    private void designUI() {
        // Update button colors and font size
        Color newButtonColor = new Color(0, 153, 76); // Green color (RGB: 0, 153, 76)
        Font newFont = new Font("Arial", Font.BOLD, 16); // Font with size 16

        for (JButton button : buttons) {
            button.setBackground(newButtonColor); // Set new background color
            button.setForeground(Color.WHITE); // Set text color to white for contrast
            button.setFont(newFont); // Set new font size
            button.setFocusPainted(false); // Remove focus painting for cleaner look
            button.setBorderPainted(false); // Remove border for a flat look
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyDictionaryApp::new); // Start the application
    }
}
