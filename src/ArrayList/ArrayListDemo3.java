package ArrayList;

import java.io.*;
import java.util.*;
public class ArrayListDemo3 {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3,90);
        list.add(80);
        list.add(900000000);
        for(Integer number :list)
        {
            System.out.println(number);
        }
    }
}
