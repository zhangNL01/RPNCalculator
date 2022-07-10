import operations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var rpnCalculator = new RPNCalculator();

        rpnCalculator.addOperation(new Addition());
        rpnCalculator.addOperation(new Absolute());
        rpnCalculator.addOperation(new Subtraction());
        rpnCalculator.addOperation(new SquareRoot());
        rpnCalculator.addOperation(new Divider());
        rpnCalculator.addOperation(new Exponentiation());
        rpnCalculator.addOperation(new Multiple());
        rpnCalculator.addOperation(new Subtraction());
        rpnCalculator.addOperation(new Logarithm());
        rpnCalculator.addOperation(new Sinus());
        rpnCalculator.addOperation(new Cos());
        rpnCalculator.addOperation(new Tan());
        rpnCalculator.addOperation(new ArcSin());

        var parser = new Parser(rpnCalculator.getOperators());
        var view = new View();
        var input = new Input(new Scanner(System.in));

        var controller = new Controller(rpnCalculator, parser, view, input);
        try {
            controller.run();
        } catch (ExpressionFormatException e) {
            e.printStackTrace();
        }
    }
}
