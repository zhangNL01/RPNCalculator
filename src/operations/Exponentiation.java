package operations;

public class Exponentiation implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "^";
    }

    @Override
    public String getDescription() {
        return "multiple one value to another value's times";
    }

    @Override
    public double execute(double... operands) {
        return Math.pow(operands[1], operands[0]);
    }

    public Exponentiation() {
        super();
    }
}