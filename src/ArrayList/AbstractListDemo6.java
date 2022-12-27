package ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListDemo6 {

    public static void main(String args[]) throws Exception
    {
        try {
            AbstractList<String> list1 = new ArrayList<String>();
            list1.add("A");
            list1.add("B");
            list1.add("C");
            list1.add("D");
            list1.add("E");

            System.out.println("Original ArrayListlist :"+list1);

            AbstractList<String> list2 = new ArrayList<String>();

            list2.add("X");
            list2.add("Y");
            list2.add("Z");

            System.out.println(list2);

            boolean value = list1.addAll(2,list2);
            System.out.println(value);

            System.out.println(list1);
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception throw : "+e);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown : "+e);
        }
    }
}
