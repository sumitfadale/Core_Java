package Collection_Programmes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ("Akshay");
        list.add ("Sumit");
        list.add ("Atul");
        list.add ("Nikita");
        list.add ("Mrunmayee");
        System.out.println("-----Using for loop -----");
        for (int i = 0; i < list.size(); i ++ )
        {
            System.out.println(list.get(i));
        }

        System.out.println("----- using For Each -----");
        for (String item : list)
        {
            System.out.println(item);
        }

        System.out.println("--- Using Iterator ----");

        Iterator <String> itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
