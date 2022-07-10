package operations;

public class Logarithm implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "log";
    }

    @Override
    public String getDescription() {
        return "calculates logarithm of the one value based on the other";
    }

    @Override
    public double execute(double... operands) {
        return Math.log(operands[1]) / Math.log(operands[0]);
    }

    public Logarithm() {
        super();
    }
}