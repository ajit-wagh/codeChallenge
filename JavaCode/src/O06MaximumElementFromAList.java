import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O06MaximumElementFromAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 6, 7, 34, 3, 2, 3);

        List<Integer> collect = list.stream().sorted((a,b)-> Integer.compare(b,a)).limit(1).collect(Collectors.toList());
        System.out.println(collect);

        Integer max = list.stream().max(Integer::compare).orElse(0);
        System.out.println(max);
    }
}
