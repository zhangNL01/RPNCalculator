import java.util.Arrays;

public class View {
    void showInLines(String[] info) {
        Arrays.asList(info).forEach(s -> System.out.println(s));
    }

    void showResult(String result) {
        System.out.println("Result is: " + result + ".\n");
    }
}
