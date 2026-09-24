import java.util.Arrays;
import java.util.List;

public class O08SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45,45, 6,41, 7, 34, 3, 2, 6);

        List<Integer> list1 = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).limit(1).toList();
        System.out.println(list1);

        int high1 = Integer.MIN_VALUE; //This is a built-in constant in Java that represents the smallest possible value an int
        int high2 = Integer.MIN_VALUE;
        if(!list.isEmpty() && list.size()>2){
            for (int i : list){
                if(i>high1){
                    high2=high1;
                    high1=i;
                }else if(i>high2 && i!=high1 ){
                    high2 = i;
                }
            }

        }
        System.out.println(high2);
    }


}
