package ArrayList;
import java.io.*;
import java.util.*;
public class ArrayListExample {

    public static void main(String args[])
    {
        int n = 5;
        ArrayList<Integer> list = new ArrayList<Integer>(n);

        for(int i = 0;i<= n;i++)
        {
            list.add(i);
            System.out.println(list);
        }
        // remove element at index 3
        list.remove(3);
        System.out.println(list);

        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
