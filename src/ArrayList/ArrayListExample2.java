package ArrayList;
import java.util.*;
import java.io.*;
public class ArrayListExample2 {

    public static void main(String args[])
    {
        int n = 5;
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        for(int i = 0;i<= n;i++)
        {
            list.add(i);
            System.out.println(list);
        }
        list.remove(3);
        System.out.println(list);


    }
}
