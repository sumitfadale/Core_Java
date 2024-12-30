package Collection_Programmes;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        System.out.println("------Inserts a key-value pair into the map.------");
        Map<Object, Object> map = new HashMap<>();
        map.put(1,"Akshay");
        map.put(2, "Sumit");
        map.put(3,"Atul");
        map.put(4,"Maitreyee");
        System.out.println(map);

        System.out.println("----Retrieves the value associated with a specific key.------");
        System.out.println(map.get(2));

        System.out.println("----Checks if the map contains a specific key.------");
        System.out.println(map.containsKey(5));

        System.out.println("-----Checks if the map contains a specific value.-----");
        System.out.println(map.containsValue("Akshay"));

        System.out.println("----Removes the mapping for a key.-----");
        map.remove(2);
        System.out.println(map);

        System.out.println("----Returns the number of key-value pairs in the map.------");
        System.out.println(map.size());

        System.out.println("-----Checks if the map is empty.-----");
        System.out.println(map.isEmpty());

        System.out.println("-----Adds the key-value pair only if the key is not already present.-----");
        map.putIfAbsent(5,"Gargee");
        System.out.println(map);
        map.putIfAbsent(5,"Prathamesh");  // here 5 is already present so it is not going to add in map
        System.out.println(map);

        System.out.println("----Replaces the value for a specific key if it is already present.-----");
        map.replace(5, "Prathamesh");
        System.out.println(map);

        System.out.println("----Returns a set view of all the keys.----");
        System.out.println(map.keySet());

        System.out.println("-----Returns a collection view of all the values.-----");
        System.out.println(map.values());

        System.out.println("-----Returns a set view of all key-value mappings.------");
        System.out.println( map.entrySet());

    }
}
