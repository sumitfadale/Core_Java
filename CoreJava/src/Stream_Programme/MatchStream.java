package Stream_Programme;

import java.util.Arrays;
import java.util.List;

public class MatchStream {
    public static void main(String[] args) {
        // anyMatch  --> if in the given elements any one condition match then return true
        // allMatch --> if all condition match then return true
        // noneMatch --> if not a single condition match  then return true.

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        boolean b = list.stream().anyMatch(x -> x % 2 == 0); // if any number is even then true else false
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x < 20); //if given number is less than 20 then true else false
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x > 20); //if given number is greater than 20 then true else false
        System.out.println(b2);
    }
}
