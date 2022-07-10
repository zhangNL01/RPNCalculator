package operations;

public class Multiple implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public String getDescription() {
        return "multiple one value to another";
    }

    @Override
    public double execute(double... operands) {
        return operands[0] * operands[1];
    }

    public Multiple() {
        super();
    }
}