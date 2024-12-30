package Collection_Programmes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        System.out.println("------Ensuring no duplicates are added.------");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("set "+set);


        System.out.println("------Combines a collection into the set, ignoring duplicates.------");
        Set <String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        List <String> list1 = List.of("Apple","Orange");
        set1.addAll(list1);
        System.out.println("set1 "+set1);

        System.out.println("-------Removing  the specified element.---------");
        Set<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        set2.remove("Banana");
        System.out.println("set2 "+set2);


        System.out.println("--------Removing all elements that are in the given collection.-------");
        Set<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Cherry");
        List <String> list3 = List.of("Apple","Orange");
        set3.removeAll(list3);
        System.out.println("set3 "+set3);
        // here apple and orange will remove from the list but apple is present into the set as well so it will remove the  apple.

        System.out.println("Checking the size and isEmpty of set");
        Set<String> set4 = new HashSet<>();
        set4.add("Apple");
        set4.add("Banana");
        set4.add("Cherry");
        System.out.println("Set size is "+ set4.size());
        System.out.println("Is Set Empty: " + set4.isEmpty());
        System.out.println(" Checking the specific value inside the set and clear all values");

        Set<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        System.out.println("is set containing 2 : "+ set5.contains(2));
        set5.clear();
        System.out.println("Clearing set values :" + set5);

        System.out.println("iterating set using Stream");
        Set<Integer> set6 = Set.of(1,2,3,4,5);
        set6.stream().forEach(System.out::println);
    }
}
