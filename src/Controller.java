import java.util.stream.Stream;

public class Controller {
    static Calculator calc;
    static Parser parser;
    static View view;
    static Input input;

    static final String[] menu = {"Welcome to my RPN Calculator App",
            "1 - Enter a RPN equation for calculation",
            "2 - Show Result",
            "h - to get help",
            "q - Quit",
            "Please enter your choice:"};

    static final String[] help = {"RPNCalculator help",
            "The following operations in RPN are supported:",
            "\tlog - calculates logarithm of one value based on the next value",
            "\tln - calculates natural logarithm of the operand",
            "\tsqrt - calculates the square root of the operand",
            "\t* - performs multiplication of two operands",
            "\t+ - performs addition of two operands",
            "\t- - subtracts the second operand from the first",
            "\t^ - performs exponentiation: operand_1^operand_2",
            "\t/ - performs division of the first operand by the second",
            "\t| - absolute the valure",
            "\tsin - calculates sin value of a value",
            "\tcos - calculates cos value of a value",
            "\ttan - calculates tan value of a value",
            "\tasin - calculates arc sin value of a value",
            "Enter 'q' to exit the program."};

    public Controller(Calculator calc, Parser parser, View view, Input input) {
        this.calc = calc;
        this.parser = parser;
        this.view = view;
        this.input = input;
    }

    static void run() throws ExpressionFormatException {
        view.showInLines(menu);
        String temp = "";
        while (input.hasInput()) {
            switch (input.getNextLine()) {
                case "1":
                    System.out.println("Please enter equation in RPN style:");
                    temp = input.getNextLine();
                    break;
                case "2":
                    if (temp.isBlank()) {
                        System.out.println("Please enter a valid input");
                    } else if (parser.canParse(temp)) {
                        view.showResult(String.valueOf(calc.execute(parser.parse(temp))));
                    } else {
                        throw new ExpressionFormatException();
                    }
                    break;
                case "h":
                    view.showInLines(help);
                    break;
                case "q":
                    System.out.println("bye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
            view.showInLines(menu);
        }
    }
}
