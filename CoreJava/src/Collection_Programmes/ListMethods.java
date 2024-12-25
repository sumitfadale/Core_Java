package Collection_Programmes;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Jamun");

        System.out.println("----Removing the element-----");
        list.remove("Mango"); // can remove the providing the details
        System.out.println(list);
        list.remove(2);  // can remove the providing the index
        System.out.println(list);

        System.out.println("----accesing the element -----");
        // we can access the element by providing the index
        System.out.println(list.get(0));

        System.out.println("----updating the element-----");
        list.set(1,"Orange");
        System.out.println(list);

        System.out.println("---- Checking Existence ----");
        boolean isContain = list.contains("Orange");
        System.out.println(isContain);

        System.out.println("--------Size of List---------");
        System.out.println(list.size());

        System.out.println("-------Checking if Empty-----");
        boolean empty = list.isEmpty();
        System.out.println(empty);

    }
}
