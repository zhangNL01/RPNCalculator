package operations;

public class Subtraction implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public String getDescription() {
        return "return the difference between two values";
    }

    @Override
    public double execute(double... operands) {
        return operands[1] - operands[0];
    }

    public Subtraction() {
        super();
    }
}