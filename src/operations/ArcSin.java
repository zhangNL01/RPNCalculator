package operations;

public class ArcSin implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "arcsin";
    }

    @Override
    public String getDescription() {
        return "calculates arc sin value of a value";
    }

    @Override
    public double execute(double... operands) {
        return Math.asin(operands[0]);
    }

    public ArcSin() {
        super();
    }
}