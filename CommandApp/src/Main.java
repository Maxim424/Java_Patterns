import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorCommandExecutor calculatorCommandExecutor
                = new CalculatorCommandExecutor();
        int firstNumber = 12;
        int secondNumber = 5;

        System.out.println(calculatorCommandExecutor.executeCommand(
                new DivideCalculatorCommand(new Calculator(firstNumber, secondNumber))));
        System.out.println(calculatorCommandExecutor.executeCommand(
                new AddCalculatorCommand(new Calculator(firstNumber, secondNumber))));
        System.out.println(calculatorCommandExecutor.executeCommand(
                new SubtractCalculatorCommand(new Calculator(firstNumber, secondNumber))));
        System.out.println(calculatorCommandExecutor.executeCommand(
                new MultiplyCalculatorCommand(new Calculator(firstNumber, secondNumber))));
    }
}