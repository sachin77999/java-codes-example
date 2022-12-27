package ArrayList;

import java.io.*;
import java.util.*;
public class ArrayListDemo5 {

    public static void main(String args[])
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);

        for(Integer number:list1)
        {
            System.out.println(number);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>(5);
        list2.add(30);
        list2.add(35);
        list2.add(40);
        list2.add(45);
        list1.addAll(list2);
        for(Integer number:list1)
        {
            System.out.println(number);
        }


    }
}
