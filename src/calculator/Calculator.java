package calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private final JLabel equationLable = new JLabel();
    private final JLabel resultLabel = new JLabel();
    private final JButton equalsButton = new JButton();
    private final JButton buttonZero = new JButton();
    private final JButton buttonOne = new JButton();
    private final JButton buttonTwo = new JButton();
    private final JButton buttonThree = new JButton();
    private final JButton buttonFour = new JButton();
    private final JButton buttonFive = new JButton();
    private final JButton buttonSix = new JButton();
    private final JButton buttonSeven = new JButton();
    private final JButton buttonEight = new JButton();
    private final JButton buttonNine = new JButton();
    private final JButton addButton = new JButton();
    private final JButton subtractButton = new JButton();
    private final JButton divideButton = new JButton();
    private final JButton multiplyButton = new JButton();
    private final JButton dotButton = new JButton();
    private final JButton delButton = new JButton();
    private final JButton clearButton = new JButton();
    private final JButton parenthesesButton = new JButton();
    private final JButton powerYButton = new JButton();


    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        initComponents();
        setLayout(null);
        setVisible(true);
    }

    public JLabel getEquationLable() {
        return equationLable;
    }

    public void initComponents() {

        equationLable.setName("EquationLabel");
        equationLable.setForeground(Color.green.darker());
        equationLable.setBounds(180, 90, 100, 30);
        add(equationLable);

        resultLabel.setName("ResultLabel");
        resultLabel.setText("0");
        resultLabel.setBounds(230,20, 240,50);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 30));
        add(resultLabel);

        equalsButton.setName("Equals");
        equalsButton.setText("=");
        equalsButton.setBounds(160, 290, 30, 30);
        add(equalsButton);

        buttonZero.setName("Zero");
        buttonZero.setText("0");
        buttonZero.setBounds(110, 290, 30, 30);
        add(buttonZero);

        buttonOne.setName("One");
        buttonOne.setText("1");
        buttonOne.setBounds(60, 250, 30, 30);
        add(buttonOne);

        buttonTwo.setName("Two");
        buttonTwo.setText("2");
        buttonTwo.setBounds(110, 250, 30, 30);
        add(buttonTwo);

        buttonThree.setName("Three");
        buttonThree.setText("3");
        buttonThree.setBounds(160, 250, 30, 30);
        add(buttonThree);

        buttonFour.setName("Four");
        buttonFour.setText("4");
        buttonFour.setBounds(60, 210, 30, 30);
        add(buttonFour);

        buttonFive.setName("Five");
        buttonFive.setText("5");
        buttonFive.setBounds(110, 210, 30, 30);
        add(buttonFive);

        buttonSix.setName("Six");
        buttonSix.setText("6");
        buttonSix.setBounds(160, 210, 30, 30);
        add(buttonSix);

        buttonSeven.setName("Seven");
        buttonSeven.setText("7");
        buttonSeven.setBounds(60, 170, 30, 30);
        add(buttonSeven);

        buttonEight.setName("Eight");
        buttonEight.setText("8");
        buttonEight.setBounds(110, 170, 30, 30);
        add(buttonEight);

        buttonNine.setName("Nine");
        buttonNine.setText("9");
        buttonNine.setBounds(160, 170, 30, 30);
        add(buttonNine);

        addButton.setName("Add");
        addButton.setText("+");
        addButton.setBounds(210, 250, 30, 30);
        add(addButton);

        subtractButton.setName("Subtract");
        subtractButton.setText("-");
        subtractButton.setBounds(210, 290, 30, 30);
        add(subtractButton);

        divideButton.setName("Divide");
        divideButton.setText("÷");
        divideButton.setBounds(210, 170, 30, 30);
        add(divideButton);

        multiplyButton.setName("Multiply");
        multiplyButton.setText("×");
        multiplyButton.setBounds(210, 210, 30, 30);
        add(multiplyButton);

        dotButton.setName("Dot");
        dotButton.setText(".");
        dotButton.setBounds(60, 290, 30, 30);
        add(dotButton);

        delButton.setName("Delete");
        delButton.setText("Del");
        delButton.setBounds(210, 130, 30, 30);
        add(delButton);

        clearButton.setName("Clear");
        clearButton.setText("C");
        clearButton.setBounds(160, 130, 30, 30);
        add(clearButton);

        parenthesesButton.setName("Parentheses");
        parenthesesButton.setText("( )");
        parenthesesButton.setBounds(60, 130, 30, 30);
        add(parenthesesButton);

        powerYButton.setName("PowerY");
        powerYButton.setText("xʸ");
        powerYButton.setBounds(110, 130, 30, 30);
        add(powerYButton);

        buttonZero.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "0");
            Operations.addLeadingZero();
        });

        buttonOne.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "1");
            Operations.addLeadingZero();
        });

        buttonTwo.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "2");
            Operations.addLeadingZero();
        });

        buttonThree.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "3");
            Operations.addLeadingZero();
        });

        buttonFour.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "4");
            Operations.addLeadingZero();
        });

        buttonFive.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "5");
            Operations.addLeadingZero();
        });

        buttonSix.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "6");
            Operations.addLeadingZero();
        });

        buttonSeven.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "7");
            Operations.addLeadingZero();
        });

        buttonEight.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "8");
            Operations.addLeadingZero();
        });

        buttonNine.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + "9");
            Operations.addLeadingZero();
        });

        addButton.addActionListener(e -> {
            String equation = equationLable.getText();
            if (!"".equals(equation)) {
                equationLable.setText(equation + "+");
            }

            Operations.addTrailingZero();
            Operations.sequentialOperators();
        });

        subtractButton.addActionListener(e -> {
            String equation = equationLable.getText();
            if (!"".equals(equation)) {
                equationLable.setText(equation + "-");
            }

            Operations.addTrailingZero();
            Operations.sequentialOperators();
        });

        divideButton.addActionListener(e -> {
            String equation = equationLable.getText();
            if (!"".equals(equation)) {
                equationLable.setText(equation + "÷");
            }

            Operations.addTrailingZero();
            Operations.sequentialOperators();
        });

        multiplyButton.addActionListener(e -> {
            String equation = equationLable.getText();
            if (!"".equals(equation)) {
                equationLable.setText(equation + "×");
            }

            Operations.addTrailingZero();
            Operations.sequentialOperators();
        });

        dotButton.addActionListener(e -> {
            String equation = equationLable.getText();
            equationLable.setText(equation + ".");
        });

        delButton.addActionListener(e -> {
            String equation = equationLable.getText();
            String afterDel = equation.substring(0, equation.length() - 1);
            equationLable.setText(afterDel);
        });

        clearButton.addActionListener(e -> {
            equationLable.setText("");
            resultLabel.setText("0");
            Operations.changeToColorGreen();
        });

        equalsButton.addActionListener(e -> {
            Operations.divisionByZeroCheck();
            Operations.checkEquationEnd();
            String equation = equationLable.getText();
            String result = String.valueOf(InputEvaluation.evaluate(equation));

            if (".0".equals(result.substring(result.length() - 2))) {
                result = result.substring(0, result.length() - 2);
            }

            resultLabel.setText(result);
        });

        parenthesesButton.addActionListener(e -> {
            String equation = equationLable.getText();
            if (Operations.areLeftAndRightParenthesesEqual(equation) || equation.endsWith("(")
                    || Operations.isOperator(equation.charAt(equation.length() - 1))) {
                equationLable.setText(equation + "(");
            } else {
                equationLable.setText(equation + ")");
            }
        });

        powerYButton.addActionListener(e -> {
            equationLable.setText(equationLable.getText() + "^(");
        });
    }
}
