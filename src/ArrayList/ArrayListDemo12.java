package ArrayList;

import java.io.*;
import java.util.*;
public class ArrayListDemo12 {

    public static void main(String args[])
    {
        Set<String> s1 = new TreeSet<String>();

        s1.add("Welcome");
        s1.add("To");
        s1.add("Geeks");
        s1.add("For");
        s1.add("Geeks");
        s1.add("TreeSet");

        // Displaying the Set
        System.out.println("Set : "+s1);

        Set<String> s2 = new TreeSet<String>();
        s2.add("arman");
        s2.add("Hello");
        s2.add("World");

        s1.addAll(s2);

        // Displaying the final Set
        System.out.println("Set : "+s1);
    }
}
