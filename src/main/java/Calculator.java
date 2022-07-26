import java.util.Scanner;

public class Calculator {
    private static Scanner scanner;

    public Calculator() {
        int a = enterFirstNumber();
        String mathOperand = enterMathOperand();
        int b = enterSecondNumber();
        getResult(a, mathOperand, b);
    }

    private static Integer enterFirstNumber() {
        System.out.print("Enter the first number: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String enterMathOperand() {
        System.out.print("Enter the math operand (f.e. +, -, *, /): ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static Integer enterSecondNumber() {
        System.out.print("Enter the second number: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
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
                result =  (float)a / b;
                break;
            default:
                System.out.println("Incorrect entered math operand");
        }
        System.out.printf("The result of this action: %s", result);
    }
}