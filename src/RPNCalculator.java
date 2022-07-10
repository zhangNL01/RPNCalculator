import operations.Operation;

import java.util.*;
import java.util.stream.Collectors;

public class RPNCalculator implements Calculator {
    private HashMap<String, Operation> operations;

    public RPNCalculator() {
        this.operations = new HashMap<>();
    }

    boolean addOperation(Operation operation) {
        if (operations.containsValue(operation)) {
            return false;
        }
        operations.put(operation.getOperator(), operation);
        return true;
    }

    Operation removeOperation(String strOperation) {
        return operations.remove(strOperation);
    }

    @Override
    public double execute(List<String> expression) {
        Stack<Double> opStack = new Stack<>();
        expression.forEach(element -> {
            Double result = 0.0;
            if (!operations.keySet().contains(element)) {
                opStack.push(Double.parseDouble(element));
            } else {
                Operation operation = operations.get(element);

                if (operation.isBinary())
                    result = operation.execute(opStack.pop(), opStack.pop());
                else
                    result = operation.execute(opStack.pop());

                opStack.push(result);
            }
        });
        return opStack.peek();
    }

    @Override
    public List<String> getOperationsInfo() {
        return operations.entrySet().stream().map(o -> o.getValue().getDescription()).collect(Collectors.toList());
    }

    public List<String> getOperators() {
        return operations.keySet().stream().collect(Collectors.toList());
    }
}
