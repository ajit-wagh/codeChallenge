import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 6, 7, 34, 3, 2, 3);
        Map <Integer, Long> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list1);
    }
}
