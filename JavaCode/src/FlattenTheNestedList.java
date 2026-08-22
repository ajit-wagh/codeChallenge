import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenTheNestedList {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(9, 1, 2, 3, Arrays.asList(45, 6, 7), 34, Arrays.asList(3, 2, 3));

        List<Integer> list1 = list.stream().flatMap(e -> {
            if (e instanceof List) {
                return ((List<Integer>) e).stream();
            }
            return Stream.of((Integer) e);
        }).toList();

        System.out.println(list1);

        List<Integer> list2 = list.stream().flatMap(e -> e instanceof List ? ((List<Integer>) e).stream() : Stream.of((Integer) e)).toList();
        System.out.println(list2);
    }
}
