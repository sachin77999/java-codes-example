package ArrayList;
import java.io.*;
import java.util.*;
public class ArrayListDemo4 {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // prints all the elements available in list1
        for(Integer number:list)
            System.out.println(number);

        ArrayList<Integer> list2 = new ArrayList<Integer>(5);
        list2.add(30);
        list2.add(35);
        list2.add(40);
        list2.add(45);

        for(Integer number : list2)
        {
     //       System.out.println(number);
        }
        list.addAll(list2);
        for(Integer number : list)
        {
            System.out.println(number);
        }
    }
}
