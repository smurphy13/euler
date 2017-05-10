import java.util.ArrayList;
/**
 * Write a description of class Factor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factor
{
    public static void main(String[]args)
    {
        //for largest prime
        /**
        long num = 600851475143L;
        System.out.println(maxPrime(num));
        **/
        
        //for amicable numbers
        System.out.println(isAmicable(220));
        int sum = 0;
        for(int i = 0; i < 10000; i++)
        {
            if(isAmicable(i))
                sum+= i;
                
        }
        System.out.println(sum);
        
    }
    
    public static boolean isAmicable(int a)
    {
        int b = totalDivisors(a);
        //System.out.println(b);
        return a == totalDivisors(b)&&a!=b;
    }
    
    public static int totalDivisors(int num)
    {
        ArrayList<Integer> divisors = Numbers.factors(num);
        int sum = 0;
        for(int i = 0; i < divisors.size(); i++)
        {
            //System.out.println(divisors.get(i)+ " " + sum);
            sum+= divisors.get(i);
        }
        sum -= num;
        return sum;
    }
    
    public static long maxPrime(long num)
    {
        for(int i = 2; i < num / 2; i++)
        {
            if(num%i == 0)
            {
                if(i > maxPrime(num / i))
                    return i;
                return maxPrime(num / i);
                }
        }
        return num;
        
    }
}
