package operations;

public class Divider implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "/";
    }

    @Override
    public String getDescription() {
        return "divide one value by another";
    }

    @Override
    public double execute(double... operands) {
        return operands[1] / operands[0];
    }

    public Divider() {
        super();
    }
}