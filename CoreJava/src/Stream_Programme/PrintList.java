package Stream_Programme;

import java.util.Arrays;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1,2,3,4);
      System.out.println("First way");
      list.stream().forEach(x -> System.out.println(x));
        System.out.println("second way way");
        list.stream().forEach(System.out::println);
        System.out.println("Third way way");
        list.forEach(System.out::println);


    }
}
