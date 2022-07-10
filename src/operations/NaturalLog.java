package operations;

public class NaturalLog implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "ln";
    }

    @Override
    public String getDescription() {
        return "calculates natural logarithm of the operand";
    }

    @Override
    public double execute(double... operands) {
        return Math.log(operands[0]);
    }

    public NaturalLog() {
        super();
    }
}