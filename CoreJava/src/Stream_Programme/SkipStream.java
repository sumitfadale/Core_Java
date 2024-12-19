package Stream_Programme;

import java.util.Arrays;
import java.util.List;

public class SkipStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<Integer> myList = list.stream().skip(1).toList(); // it will skip the 1st element of list
        System.out.println(myList);
    }
}
