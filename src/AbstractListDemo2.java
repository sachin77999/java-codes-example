import java.util.*;

public class AbstractListDemo2 {

    public static void main(String args[])
    {
        AbstractList<String> list = new ArrayList<String>();

        // Using add() method to add elements in the list

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        // Output the list
        System.out.println("AbstractList:" + list);

        list.remove(3);

        System.out.println("Final AbstractList: " + list);

        int lastindex = list.lastIndexOf("A");

        System.out.println("Last index of A : "+ lastindex);


    }
}
