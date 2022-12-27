package ArrayList;

import java.util.*;
public class ArrayListDemo11 {

    public static void main(String args[])
    {
        List<String> myList = new ArrayList<String>();
        myList.add("Geeks");
        myList.add("Practice");
        myList.add("Quiz");
        System.out.println("Original ArrayList : "+myList);
        myList.remove("Quiz");
        System.out.println("Modified ArrayList : "+myList);

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("SQL");
        list.add("Spring");
        list.add("C Language");
        System.out.println("Original LinkedList : "+list);
        list.remove("C Language");
        System.out.println("Modified LinkedList : "+list);
    }
}
