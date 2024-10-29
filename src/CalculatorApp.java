public class CalculatorApp {
    public static void main(String[] args) {
        // Инициализация компонентов MVC
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);

        // Отображаем интерфейс пользователя
        view.setVisible(true);
    }
}
