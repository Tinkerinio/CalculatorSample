import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private final JTextField firstNumberField = new JTextField(10);
    private final JTextField secondNumberField = new JTextField(10);
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");
    private final JLabel resultLabel = new JLabel("Result:");

    public CalculatorView() {
        // Устанавливаем параметры окна
        setTitle("Calculator");
        setSize(420, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Добавляем компоненты на панель
        add(new JLabel("First number:"));
        add(firstNumberField);
        add(new JLabel("Second number:"));
        add(secondNumberField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        add(buttonPanel);

        add(resultLabel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }

    public void setResult(String result) {
        resultLabel.setText("Result: " + result);
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    // Регистрация слушателей для кнопок операций
    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }
}

