package ArrayList;

import java.util.*;
public class AbstractListDemo7 {

    public static void main(String args[]) throws Exception

    {
        try {
       AbstractList<String> list = new ArrayList<String>();

       list.add("Sachin");
       list.add("Rohan");
       list.add("Pawan");
       list.add("Shelly");

       System.out.println("Original AbstractList:"+list);

       List<String> list2 = list.subList(2,4);
       System.out.println(list2);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
