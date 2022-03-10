# CalculatorApplication

<img src="https://github.com/nikolst/CalculatorApplication/blob/master/Screenshot%202022-03-10%20at%2018.21.57.png" width="300" height="400">

## GUI :art:

The interface consists of 20 buttons and two labels. 

Types of lables:
  * equationLable - visualizes the input data
  * resultLable - visualizes the result of the equation

Types of buttons:
  * digits from 0 to 9
  * operators
  * equals button (=) which evaluates the provided input
  * Delete (Del) and Clear (C) buttons

## Functions :mag:
This calculator application supports:
  * Addition [+] - add numbers
  * Subtraction [-] - subtract numbers
  * Multiplication [×] - multiply numbers
  * Division [÷] - divide numbers
  * Power [^] - a number raised to the power of another number 
  * Parenthesis [( )] - put parethesis
      * if the number of left and right parenthesis is equal or there are not parenthesis, it adds left parethesis '('
      * if the number of left and right parethesis is not equal, it adds right parenthesis ')'
  * Decimal point [.] - make a decimal number
      * if the equation starts with '.', it automatically adds '0' before it
      * if there is no digit after the '.', it automatically adds '0' after it
  * Equals sign [=] - calculates the result
  * Delete [Del] - deletes the last symbol 
  * Clear [C] - clears all symbols 

## Limitations :no_entry:
  * The equation can't start with operators +, -, ×, ÷ and can't end with it
  * It is not possible division by zero
  * If there is mistake, the color of the input changes to red color

## Usage :warning:

Inputs can be done only with the application's buttons. It is not possible to enter symbols from the keyboard. 
