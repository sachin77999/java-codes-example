package ArrayList;
import java.io.*;
import java.util.*;
public class ArrayListDemo2 {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(4,50);
        for(Integer number:list)
        {
            System.out.println(number);
        }
    }
}
