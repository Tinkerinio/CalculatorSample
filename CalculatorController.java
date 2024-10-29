import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Регистрация контроллера как слушателя для кнопок операций
        this.view.addOperationListener(new OperationListener());
    }

    class OperationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber;

            try {
                // Получаем числа из View
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();

                // Вычисляем результат в зависимости от нажатой кнопки
                if (e.getSource() == view.addButton) {
                    view.setResult(String.valueOf(model.add(firstNumber, secondNumber)));
                } else if (e.getSource() == view.subtractButton) {
                    view.setResult(String.valueOf(model.subtract(firstNumber, secondNumber)));
                } else if (e.getSource() == view.multiplyButton) {
                    view.setResult(String.valueOf(model.multiply(firstNumber, secondNumber)));
                } else if (e.getSource() == view.divideButton) {
                    try {
                        view.setResult(String.valueOf(model.divide(firstNumber, secondNumber)));
                    } catch (ArithmeticException ex) {
                        view.showError("Ошибка: деление на ноль");
                    }
                }
            } catch (NumberFormatException ex) {
                view.showError("Ошибка: Введите корректные числа.");
            }
        }
    }
}

