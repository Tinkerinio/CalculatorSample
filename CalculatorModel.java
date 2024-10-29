public class CalculatorModel {

    // Метод для сложения двух чисел
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания второго числа из первого
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения двух чисел
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления первого числа на второе
    // В случае деления на ноль выбрасывает ArithmeticException
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль");
        }
        return a / b;
    }
}

