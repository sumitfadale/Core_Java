package Stream_Programme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startwith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshay", "Sumit", "Atul","Ananya","Maitreyee");
        List<String> myList = list.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(myList);
    }
}
