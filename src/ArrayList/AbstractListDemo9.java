package ArrayList;

import java.io.*;
import java.util.*;
public class AbstractListDemo9 {

    public static void main(String args[])
    {
        try {
            AbstractList<String> list = new ArrayList<String>();

            list.add("Janvi");
            list.add("kNAVI");
            list.add("Manvi");
            list.add("Runway");
            list.add("Landway");

            System.out.println("Original List:" + list);

            List<String> list2 = list.subList(2, 4);
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
