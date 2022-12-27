package ArrayList;

import java.io.*;
import java.util.*;
public class ArrayListExample3 {

public static void main(String args[])
{
    int n  =5;
    ArrayList<Integer> list = new ArrayList<Integer>(5);
    for(int i = 0;i<= 5;i++)
    {
        list.add(i);
    }
    System.out.println(list);
    list.remove(3);
    for(int i = 0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }
}
}
