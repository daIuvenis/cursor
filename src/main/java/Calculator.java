import java.util.Scanner;

public class Calculator extends Terminal{

    public Calculator() {
        int a = enterFirstNumber();
        String mathOperand = enterMathOperand();
        int b = enterSecondNumber();
        getResult(a, mathOperand, b);
    }

    private static void getResult(int a, String operand, int b) {
        float result = 0f;
        switch (operand) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = (float) a / b;
                }
                break;
            default:
                System.out.println("Incorrect entered math operand");
        }
        System.out.printf("The result of this action: %s", result);
    }
}