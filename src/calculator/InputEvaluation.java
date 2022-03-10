package calculator;

import java.util.Stack;

public class InputEvaluation {
    public static double evaluate(String expression) {

        char[] symbols = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Double> values = new Stack<>();

        // Stack for Operators: 'operators'
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < symbols.length; i++) {

            // If current symbol is whitespace, skip it
            if (symbols[i] == ' ') {
                continue;
            }

            // If current symbol is a number, push it to stack for numbers
            if (symbols[i] >= '0' && symbols[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                // There may be more than one digits in number
                while (i < symbols.length && symbols[i] != '+' && symbols[i] != '-'
                        && symbols[i] != '÷' && symbols[i] != '×' && symbols[i] != '(' && symbols[i] != ')'
                        && symbols[i] != '^') {
                    sbuf.append(symbols[i++]);
                }

                values.push(Double.parseDouble(sbuf.toString()));
                i--;
            }

            // If current symbol is an opening brace, push it to 'operators'
            else if (symbols[i] == '(') {
                operators.push(symbols[i]);
            }

            // If closing brace is encountered, solve entire brace
            else if (symbols[i] == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }

                operators.pop();
            }

            // Current symbol is an operator.
            else if (symbols[i] == '+' || symbols[i] == '-' || symbols[i] == '×' || symbols[i] == '÷'
                    || symbols[i] == '^') {
                // While top of 'operators' has same or greater precedence to current symbol, which is an operator.
                // Apply operator on top of 'operators' to top two elements in values stack
                while (!operators.empty() && hasPrecedence(symbols[i], operators.peek())) {
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }

                // Push current symbol to 'operators'.
                operators.push(symbols[i]);
            }
        }

        while (!operators.empty()) {
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));
        }

        // If top of 'values' contains the result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1', otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '×' || op1 == '÷') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    public static double applyOp(char op, double b, double a)
    {
        switch (op) {
            case '^':
                return Math.pow(a, b);
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '×':
                return a * b;
            case '÷':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}
