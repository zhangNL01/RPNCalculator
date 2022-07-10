import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    List<String> supportedOps;
    private String[] numbers = {"0", "1", "2"};

    public Parser(List<String> operators) {
        this.supportedOps = operators;
    }

    boolean canParse(String expression) {
        if (expression.length() <= 1)
            return false;
        for (String s : expression.split(" ")) {
            if (!supportedOps.contains(s)) {
                try {
                    Double.parseDouble(s);
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }

    List<String> parse(String expression) {
        return Arrays.asList(expression.trim().split(" "));
    }
}
