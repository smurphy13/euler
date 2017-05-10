
/**
 * Write a description of class fifthPowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fifthPowers extends Numbers
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 2; i < 2000000; i++)
        {
            if(sumPowers(i)==i)
            {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
    
    public static int sumPowers(int num)
    {
        int sum = 0;
        for(int i = 0; i < numDigits(num); i++)
        {
            sum+=Math.pow(digit(num,i),5);
        }
        return sum;
    }
}
