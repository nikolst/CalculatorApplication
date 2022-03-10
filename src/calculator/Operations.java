package calculator;

import java.awt.*;

public class Operations {

    static Calculator calculator = new Calculator();

    public static void checkEquationEnd() {
        String equation = calculator.getEquationLable().getText();
        if (equation.endsWith("+") || equation.endsWith("-") || equation.endsWith("÷") || equation.endsWith("×")) {
            changeToColorRed();
        }
    }

    public static void addLeadingZero() {
        String equation = calculator.getEquationLable().getText();
        if (equation.length() > 1 && equation.startsWith(".")) {
            equation = "0" + equation;
            calculator.getEquationLable().setText(equation);
        }
    }

    public static void addTrailingZero() {
        String equation = calculator.getEquationLable().getText();
        if (equation.length() > 1) {
            char[] array = equation.toCharArray();
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == '.' && !isNumber(array[i + 1])) {
                    equation = equation.substring(0, i + 1) + "0" + equation.substring(i + 1);
                }
            }
            calculator.getEquationLable().setText(equation);
        }
    }

    public static void divisionByZeroCheck() {
        String equation = calculator.getEquationLable().getText();
        if ("÷0".equals(equation.substring(equation.length() - 2))) {
            changeToColorRed();
        } else {
            changeToColorGreen();
        }
    }

    public static boolean isNumber(char character) {
        if (character >= '0' && character <= '9') {
            return true;
        }
        return false;
    }

    public static void sequentialOperators() {
        String equation = calculator.getEquationLable().getText();
        char[] symbols = equation.toCharArray();
        for (int i = 0; i < symbols.length - 1; i++) {
            if (isOperator(symbols[i]) && isOperator(symbols[i + 1])) {
                equation = equation.substring(0, i) + equation.substring(i + 1);
                System.out.println(equation);
            }
        }
        calculator.getEquationLable().setText(equation);
    }

    public static void changeToColorRed() {
        calculator.getEquationLable().setForeground(Color.red.darker());
    }

    public static void changeToColorGreen() {
        calculator.getEquationLable().setForeground(Color.green.darker());
    }

    public static boolean areLeftAndRightParenthesesEqual(String equation) {
        int leftParenthesis = 0;
        int rightParenthesis = 0;
        char[] symbols = equation.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '(') {
                leftParenthesis++;
            } else if (symbols[i] == ')') {
                rightParenthesis++;
            }
        }

        if (leftParenthesis == rightParenthesis) {
            return true;
        }

        return false;
    }

    public static boolean isOperator(char symbol) {
        if (symbol == '+' || symbol == '-' || symbol == '÷' || symbol == '×') {
            return true;
        }

        return false;
    }
}
