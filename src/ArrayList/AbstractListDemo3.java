package ArrayList;

import java.util.*;
public class AbstractListDemo3 {

    public static void main(String args[]) throws Exception
    {
        try {
            AbstractList<String> list = new ArrayList<String>();

            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");

            System.out.println("Original ArrayListlist : " + list);

            AbstractList<String> list2 = new ArrayList<String>();

            list2.add("X");
            list2.add("Y");
            list2.add("Z");

            System.out.println("List2 :"+list2);

            boolean value = list.addAll(2,list2);

            System.out.println(value);

            System.out.println(list);



        }
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
