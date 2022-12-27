package ArrayList;

import java.util.*;
public class AbstractListDemo1 {

    public static void main(String args[])
    {
        AbstractList<String> list = new ArrayList<String>();
        list.add("Sachin");
        list.add("Soni");
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // displaying the AbstractList
        System.out.println("AbstractList:"+list);
    }
}
