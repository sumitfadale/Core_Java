package Stream_Programme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayEvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .boxed().collect(Collectors.toList()); // for array we need a boxed method
        System.out.println(list);
    }

}
