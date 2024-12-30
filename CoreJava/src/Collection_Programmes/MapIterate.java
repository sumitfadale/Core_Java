package Collection_Programmes;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("1. Using entrySet() and for-each:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n2. Using keySet():");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\n3. Using values():");
        for (Integer value : map.values()) {

            System.out.println("Value: " + value);
        }

        System.out.println("\n4. Using forEach (Java 8+):");
        map.forEach((a, b) -> System.out.println("Key: " + a + ", Value: " + b));

        System.out.println("\n5. Using Iterator:");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
