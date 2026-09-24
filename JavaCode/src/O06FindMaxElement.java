import java.util.Arrays;
import java.util.List;

public class O06FindMaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 8, 3, 34, 67, 9, 54, 67, 9, 0, 5, 3, 54, 32);
        int  collect = list.stream().max(Integer::compare).orElse(0);
        System.out.println(collect);
    }
}
//Find the maximum element from a List using Streams.
