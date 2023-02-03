public class AddCalculatorCommand extends CalculatorCommand{
    private final Calculator calculator;
    public AddCalculatorCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    String execute() {
        return calculator.add();
    }
}
