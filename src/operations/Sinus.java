package operations;

public class Sinus implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "sin";
    }

    @Override
    public String getDescription() {
        return "calculates sin value of a value";
    }

    @Override
    public double execute(double... operands) {
        return Math.sin(operands[0]);
    }

    public Sinus() {
        super();
    }
}