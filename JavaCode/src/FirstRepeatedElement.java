import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('A','B','C','B','A','D','T');
        Character key = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).findFirst().orElse(null).getKey();
        System.out.println(key);

    }
}
