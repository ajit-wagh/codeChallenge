import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class O10ThirdHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45,45, 6,41, 7, 34, 3, 2, 6);
        List<Integer> limit = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(2).limit(1).toList();
        System.out.println(limit);

        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        int high3 = Integer.MIN_VALUE;

        for (int i : list){
            if(i>high1){
                high2 = high1;
                high3 = high2;
                high1 = i;
            } else if (i>high2 && i!=high1) {
                high3 = high2;
                high2 = i;
            } else if (i>high3 && i!=high1 && i!=high2) {
                high3 = i;
            }
        }
        System.out.println(high3);
    }
}
