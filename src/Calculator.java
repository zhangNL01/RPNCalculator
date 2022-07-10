import java.util.List;

public interface Calculator {
    double execute(List<String> expression);

    List<String> getOperationsInfo();
}
