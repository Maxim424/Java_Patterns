public class PrintCalculatorCommand extends CalculatorCommand {
    private final Calculator calculator;
    public PrintCalculatorCommand(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    String execute() {
        return calculator.printToConsole();
    }
}
