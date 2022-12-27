package ArrayList;
import java.util.*;
public class ArrayListDemo8 {

    public static void main(String args[]) throws Exception {
        try{
       List<String> list = new ArrayList<String>();
       list.add("Sachin Soni");
       list.add("Rohan Soni");
       list.add("Hoshiarpur Soni");

       System.out.println("arrayList before operation "+list);

       boolean b = Collections.addAll(list,"1","736734","9832");

       System.out.println("result : "+b);

       System.out.println("ArrayList after operation"+list);


        }
        catch(NullPointerException e)
        {
            System.out.println("Exception thrown : "+ e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception thrown : " + e);
        }
    }
}
