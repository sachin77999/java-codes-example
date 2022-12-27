package ArrayList;

import java.util.ArrayList;
public class ArrayListDemo7 {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Initial list is:"+list);

        list.clear();
        System.out.println("Final Lst is :"+list);
    }
}
