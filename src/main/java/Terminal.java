import java.util.Scanner;

public class Terminal {
    private static Scanner scanner;

    protected static Integer enterFirstNumber() {
        System.out.print("Enter the first number: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    protected static String enterMathOperand() {
        System.out.print("Enter the math operand (f.e. +, -, *, /): ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    protected static Integer enterSecondNumber() {
        System.out.print("Enter the second number: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
