import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class O05CountTheFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 6, 7, 34, 3, 2, 3);
        Map <Integer, Long> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list1);

        String str = "jhgsbo;jfd lk jloiejf;lijl;owpo";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
