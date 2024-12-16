package Stream_Programme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DevideNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> myList = list.stream().filter(num -> num % 2 == 0).map(num -> num/2)
                .collect(Collectors.toList());
        System.out.println(myList);
    }
}
