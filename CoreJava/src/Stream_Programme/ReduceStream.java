package Stream_Programme;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {
    public static void main(String[] args) {
        //Reduce function is for the combines the elements for the single result

        List<Integer> list  = Arrays.asList(1,2,3,4);
        Optional<Integer> mylist =  list.stream().reduce((x, b) -> x +b);
        //Optional is use for the combine the value. it may be null or not null
        System.out.println(mylist);
        System.out.println(mylist.get());
        Optional<Integer> mylist1 =  list.stream().reduce(Integer::sum);
        System.out.println(mylist1.get());



    }
}
