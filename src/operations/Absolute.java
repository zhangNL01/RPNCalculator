package operations;

public class Absolute implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "|";
    }

    @Override
    public String getDescription() {
        return "remove negetive sign";
    }

    @Override
    public double execute(double... operands) {
        return Math.abs(operands[0]);
    }

    public Absolute() {
        super();
    }
}
