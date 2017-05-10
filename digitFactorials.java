
/**
 * Write a description of class digitFactorials here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class digitFactorials extends Numbers
{
    public static void main(String[] args)
    {
        long total = 0L;
        for(long i = 3L; i < 10000000;i++)
        {
            if(isDigitFac(i))
            {
                total+=i;
                System.out.println(i);
            }
            
        }
        System.out.println(total);
    }
    
    public static boolean isDigitFac(long num)
    {
        int sum = 0;
        for(int i = 0; i < numDigits(num);i++)
        {
            sum+=factorial(digit(num,i),0);
        }
        return sum==num;
    }
}
