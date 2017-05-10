import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class Names here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameScore
{
    public static void main (String []args) throws IOException
    {
        
        String[] names = new String[5163];
        Scanner joe = new Scanner(new File("names.txt"));
        String all = "";
        while(joe.hasNext())
        {
            all = all + joe.next();
        }
        String last = "ALONSO";
        //System.out.println(last.compareTo("ALONSO"));
        int i = 0;
        while(all.indexOf(",")>0)
        {
            names[i] =all.substring(all.indexOf("\"")+1,all.indexOf(",")-1);
            all = all.substring(all.indexOf(",")+1);
            i++;
        }
        names[5162] =last;
        
        
        
        
        //String[] names = {"BOB","COLT","ALLEN","EARL","DAVE"};
        mergeSort(names);
        
        
        for(String a: names)
        {
            System.out.print(a+ " ");
        }
        System.out.println();
        
        int value = 0;
        //Numbers sum = new Numbers();
        long sum = 0L;
        System.out.println((int)last.charAt(0)-64);
        for(int k = 0; k < names.length; k++)
        {
            value = 0;
            for(int j = 0; j < names[k].length();j++)
            {
                value+=(int)(names[k].charAt(j))-64;
            }
            if(k == 937)
            {
                System.out.println(value+" " + names[k]);
            }
            //sum.add(value*k);
            sum+=value*(k+1);
        }
        System.out.println(sum);
        //sum.print();
    }
    

    
    public static void mergeSort(String[] array)
    {
        if(array.length < 2)
            return;
        int mid = (int)(array.length / 2);
        String[] left = new String[mid];
        String[] right = new String[array.length-mid];
        for(int i = 0; i < array.length; i++)
        {
            if(i<mid)
                left[i] = array[i];
            else
                right[i-mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);

    }
    
    public static void merge(String[] left, String[] right, String[] array)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        /**
        for(String a: array)
        {
            System.out.print(a+" ");
        }
        
        System.out.println();
        **/
        while(i < left.length&& j < right.length)
        {
            
            if(left[i].compareTo(right[j])<0)
            {
                array[k] = left[i];
                i++;
                k++;
            }
            else
            {
                array[k] = right[j];
                j++;
                k++;
            }
                
        }
        
        while(j < right.length)
        {

            array[k] = right[j];
            k++;
            j++;
        }
        while(i<left.length)
        {
            array[k] = left[i];
            k++;
            i++;
        }
        /**
        for(String a: array)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        **/
    }
    
    
}
