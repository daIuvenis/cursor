import heplers.MoreNumberException;

public class Calculator extends Terminal implements ICalculator {
    int firstNumber = enterFirstNumber();
    String mathOperand = enterMathOperand();
    int secondNumber = enterSecondNumber();

    public Calculator() {
    }

    public void getResult() throws MoreNumberException {
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
                    try {
                        result = (float) firstNumber / secondNumber;
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Incorrect entered math operand");
            }
        if (result > 100){
            throw new MoreNumberException("The result more than 100");
        }
        System.out.printf("The result of this action: %s", result);
    }
}