package operations;

public class Cos implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "cos";
    }

    @Override
    public String getDescription() {
        return "calculates cos value of a value";
    }

    @Override
    public double execute(double... operands) {
        return Math.cos(operands[0]);
    }

    public Cos() {
        super();
    }
}