package operations;

public class Tan implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "tan";
    }

    @Override
    public String getDescription() {
        return "calculates tan value of a value";
    }

    @Override
    public double execute(double... operands) {
        return Math.tan(operands[0]);
    }

    public Tan() {
        super();
    }
}