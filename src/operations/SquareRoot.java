package operations;

public class SquareRoot implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "sqrt";
    }

    @Override
    public String getDescription() {
        return "calculates the square root of the operand";
    }

    @Override
    public double execute(double... operands) {
        return Math.sqrt(operands[0]);
    }

    public SquareRoot() {
        super();
    }
}