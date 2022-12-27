package ArrayList;

import java.util.*;
public class ArrayListDemo9 {

    public static void main(String args[]) throws Exception
    {
        try{
       List<String> list = new ArrayList<String>();
       list.add("Sachin Soni");
       list.add("Rohan Soni");
       list.add("Pawan Soni");
       System.out.println("ArrayList before operation:"+list);

       boolean b = Collections.addAll(list,"1212","24243","5664");
       System.out.println("result : "+b);

       System.out.println("ArrayList after operations : "+list);

        }
        catch(NullPointerException e)
        {
        System.out.println("Exception throw : "+e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception thrown : "+e);
        }
    }
}
