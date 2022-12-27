package ArrayList;

import java.util.*;
public class ArrayListDemo10 {

    public static void main(String args[]) throws Exception
    {
     try {
         ArrayList<String> list = new ArrayList<String>();
         list.add("Sachin");
         list.add("Rohan");
         list.add("Pawan");
         list.add("Soni");

         System.out.println("Array List Before Operation:"+list);
         boolean b = Collections.addAll(null,list);

         System.out.println("result :"+b);

         System.out.println("array list after operations:"+list);
     }
     catch(NullPointerException e)
     {
         System.out.println("Exception throw : "+e);
     }
     catch(IllegalArgumentException e)
     {
         System.out.println("Exception throw : "+e);
     }
    }
}
