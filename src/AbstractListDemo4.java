import java.util.*;
public class AbstractListDemo4 {

    public static void main(String args[]) throws Exception {
        try {
            AbstractList<String> list = new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");

            // print the list
            System.out.println("Original ArrayListlist :" + list);

            AbstractList<String> list2 = new ArrayList<String>();

            list2.add("X");
            list2.add("Y");
            list2.add("Z");

            System.out.println(list2);

            boolean value = list.addAll(2, list2);

            System.out.println("Operation successfull : " + value);

            // print the new arrlist
            System.out.println("New ArrayList : "
                    + list);
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception thrown : "+e);
    }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown : "+e);
        }
    }

}
