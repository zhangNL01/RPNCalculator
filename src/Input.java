import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    Scanner sc;

    public Input(Scanner sc) {
        this.sc = sc;
    }

    boolean hasInput() {
        return sc.hasNextLine();
    }

    String getNextLine() {
        return sc.nextLine().trim();
    }
}
