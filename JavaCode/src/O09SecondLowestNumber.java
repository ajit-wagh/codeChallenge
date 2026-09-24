import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class O09SecondLowestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 20, 3, 45, 6,41, 7, 34, 3, 2, 6);
        List<Integer> collect = list.stream().distinct().sorted().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(collect);

        int low1 = Integer.MAX_VALUE;
        int low2 = Integer.MAX_VALUE;

        for (int i : list) {
            if(i<low1){
                low2 = low1;
                low1 = i;
            }else if (i < low2 && i != low1) {
                low2 = i;
            }
        }
        System.out.println(low2);

    }
}
