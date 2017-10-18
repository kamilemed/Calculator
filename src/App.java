import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Calculator calculator = new Calculator();
        frame.add(calculator.getPanel());
        calculator.getPanel().updateUI();

    }
}
