package Stream_Programme;

import java.util.Arrays;
import java.util.List;

public class LimitStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer>myList = list.stream().limit(3).toList(); // it will show the element from 1st to given size
        System.out.println(myList);
    }
}
