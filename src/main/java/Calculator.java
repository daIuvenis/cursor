public class Calculator extends Terminal implements ICalculator {
    int firstNumber = enterFirstNumber();
    String mathOperand = enterMathOperand();
    int secondNumber = enterSecondNumber();

    public Calculator() {
    }

    public void getResult() {
        float result = 0f;
        switch (mathOperand) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = (float) firstNumber / secondNumber;
                }
                break;
            default:
                System.out.println("Incorrect entered math operand");
        }
        System.out.printf("The result of this action: %s", result);
    }
}