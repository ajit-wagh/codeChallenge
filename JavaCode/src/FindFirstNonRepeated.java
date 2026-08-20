import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeated {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('A','B','C','B','D','A');
        Character key = list.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().map(Map.Entry::getKey).orElse(null);

        System.out.println(key);

    }
}
