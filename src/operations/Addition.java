package operations;

public class Addition implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public String getDescription() {
        return "puls two numbers together";
    }

    @Override
    public double execute(double... operands) {
        return operands[0] + operands[1];
    }

    public Addition() {
        super();
    }
}
