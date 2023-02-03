import java.util.ArrayList;
import java.util.List;

public class CalculatorCommandExecutor {
    private final List<CalculatorCommand> calculatorCommands = new ArrayList<>();

    public String executeCommand(CalculatorCommand calculatorCommand) {
        calculatorCommands.add(calculatorCommand);
        return calculatorCommand.execute();
    }
}
