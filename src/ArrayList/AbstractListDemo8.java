package ArrayList;

import java.util.*;
public class AbstractListDemo8 {

    public static void main(String args[])
    {
        try {
            AbstractList<String> list = new ArrayList<String>();
            list.add("Ram");
            list.add("Shaam");
            list.add("karan");
            list.add("arjun");
            list.add("amana");

            System.out.println("Original AbstractList : "+list);

            List<String> list2 = list.subList(2,3);

            System.out.println(list2);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
}
