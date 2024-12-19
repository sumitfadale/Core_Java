package Stream_Programme;

import java.util.Arrays;
import java.util.List;

public class DistinctStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshay","Atul","Sumit","Neha","Akshay","sumit");
        List <String> myList = list.stream().map(String::toLowerCase).distinct().toList();
        System.out.println(myList);
    }
}
