public class SubtractCalculatorCommand extends CalculatorCommand {
    private final Calculator calculator;
    public SubtractCalculatorCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    String execute() {
        return calculator.subtract();
    }
}
