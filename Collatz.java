
/**
 * Write a description of class Collatz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collatz
{
    public static void main(String []args)
    {
        int temp = 0;
        int max = 0;
        int answer = 0;
        for(int i =2; i <1000000;i++)
        {
            System.out.print(i+ "   ");
            temp = colSequence(i);
            System.out.println(temp + "   ");
            if(temp > max)
            {
                max = temp;
                answer = i;
            }
        }
        System.out.println(answer+ " " +max);
    }
    
    public static int colSequence(long n)
    {
        int len = 1;
        
        while(n != 1)
        {
            if(Math.log10(n)/Math.log10(2)%1 == 0)
            {
                len += Math.log10(n)/Math.log10(2);
                break;
                
            }
            else if(n%2==0)
            {
                n = n/2;
                len++;
            }
            else
            {
                n = 3*n+1;
                len++;
            }
            //System.out.print(n+ "   ");
            //len+= 2;
        }
        return len;
    }
}
