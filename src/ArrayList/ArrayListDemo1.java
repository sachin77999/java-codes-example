package ArrayList;
import java.io.*;
import java.util.*;
public class ArrayListDemo1 {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Integer number:list)
        {
            System.out.println("Number = "+ number);
        }
    }
}
