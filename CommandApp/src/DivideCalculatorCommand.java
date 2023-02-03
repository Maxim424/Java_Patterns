public class DivideCalculatorCommand extends CalculatorCommand {
    private final Calculator calculator;
    public DivideCalculatorCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    String execute() {
        return calculator.divideByDouble();
    }
}
