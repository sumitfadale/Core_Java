package Stream_Programme;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","D","C","B");
        List<Integer> list2 = Arrays.asList(1,2,5,7,3);
        List<String> ascList = list.stream().sorted().collect(Collectors.toList()); // natural or ascending order
        System.out.println(ascList);
        List<String> decList = list.stream().sorted((a,b)->(b.compareTo(a) )).toList();
        System.out.println(decList);
        List<Integer> decList2 = list2.stream().sorted((a,b)->(b-a)).toList();
        System.out.println(decList2);




    }
}
