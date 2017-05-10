
/**
 * Write a description of class sumSquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumSquare
{
    public static void main(String []args)
    {
        long sumSquare = 0L;
        long squareSum = 0L;
        for(int i = 1; i < 101; i++)
        {
            sumSquare = sumSquare + i*i;
            squareSum = i+ squareSum;
        }
        squareSum = squareSum*squareSum;
        System.out.println(sumSquare);
        System.out.println(squareSum);
        System.out.println(squareSum-sumSquare);
        
    }
}
