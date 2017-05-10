
import java.util.ArrayList;
/**
 * Write a description of class Pentagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class PentagonalNum extends ShapeNums
{
    public PentagonalNum(int size)
    {
        super(size); 
    }
    
    public long ShapeNum(int index)
    {
        return (index*((long)3*index-1)/2);
    }
    static int minimum = 0;
    public static void main(String[] args)
    {
        //for pentagonal
        /**
        PentagonalNum joe = new PentagonalNum(10000);
        
        
        System.out.println(smallest(0));
        **/
        
        
        
    }
    
    
    
    public long smallest(int index)
    {
        int i = index;
        long min = shapeNums[shapeNums.length-1];
        long temp = 0; 
        if(index >= shapeNums.length)
            return temp;
        while(i<shapeNums.length)
        {
            for(int j = i; j<shapeNums.length; j++)
            {
                //System.out.println(i+" "+j+" " +index);
                if(binarySearch(shapeNums[j]-shapeNums[i])&& binarySearch(shapeNums[j]+shapeNums[i]))
                {
                    temp = shapeNums[j]-shapeNums[i];
                    //System.out.println(shapeNums[j]+" "+shapeNums[i]);
                    //i = shapeNums.length;
                    if(min > temp)
                        min =temp;
                    //break;
                }
            }
            i++;
        }
        
        
        return min;
    }
    
    
}
