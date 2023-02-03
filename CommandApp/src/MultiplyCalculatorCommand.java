public class MultiplyCalculatorCommand extends CalculatorCommand {
    private final Calculator calculator;
    public MultiplyCalculatorCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    String execute() {
        return calculator.multiply();
    }
}
