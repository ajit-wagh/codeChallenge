import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//7. Find the minimum element from a List.
public class O07FindMinimumElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 4, 6, 8, 3, 34, 67, 9, 54, 67, 9, 110, 5, 3, 54, 32);
        int minValue = list.stream().min(Integer::compare).orElse(0);
        System.out.println(minValue);
    }
}
