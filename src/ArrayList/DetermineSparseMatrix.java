package ArrayList;
import java.io.*;
import java.util.*;
public class DetermineSparseMatrix {
    
    public static void main(String args[])
    {
        int array[][] = {{1,0,3},{0,0,4},{6,0,0}};
        int m = 3,n = 3;
        int counter = 0;

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        if(array[i][j] == 0)
        ++counter;

        if(counter > ((m*n)/2))
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
}
