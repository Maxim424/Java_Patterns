public class Calculator {

    private final int firstNumber;
    private final int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String divideByInteger() {
        return String.valueOf((firstNumber / secondNumber));
    }

    public String divideByDouble() {
        return String.valueOf(((double) firstNumber / (double) secondNumber));
    }

    public String multiply() {
        return String.valueOf(firstNumber * secondNumber);
    }

    public String add() {
        return String.valueOf(firstNumber + secondNumber);
    }

    public String subtract() {
        return String.valueOf(firstNumber - secondNumber);
    }

    public String printToConsole() {
        return firstNumber + "\t" + secondNumber;
    }
}
