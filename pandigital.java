import java.util.ArrayList;
/**
 * Write a description of class pandigital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class pandigital extends Numbers
{
    public static boolean isPandigital(long together)
    {
        
        boolean[] isthere = new boolean[numDigits(together)];
        /**
        if(numDigits(together) != 9)
            return false;
            **/
        for(int i = 0; i < numDigits(together); i++)
        {
            for(int j = 1; j < numDigits(together)+1; j++)
            {
                if(!isthere[j-1]&&j==digit(together,i))
                {
                    isthere[j-1] = true;
                    
                }
                
                    
           }
        }
        
        for(int i = 0; i < numDigits(together); i++)
        {
            if(!isthere[i])
                return false;
        }
        return true;
    }
    public static boolean isPandigital(long together, int digits)
    {
        
        boolean[] isthere = new boolean[10];
        
        if(digits == 9)
            isthere[0] = true;
        int j = 0;
        for(int i = 0; i < digits; i++)
        {
            j = digits-9;
                
            while(j < digits+1)
            {
                if(!isthere[j]&&j==digit(together,i))
                {
                    isthere[j] = true;
                    
                }
                else if(isthere[j]&&j==digit(together,i))
                    isthere[j] = false;
                
                j++;
            }
        }
        
        for(int i = 0; i < digits; i++)
        {
            if(!isthere[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        //original
        /**
        int product = 0;
        int multiplicand = 1;
        int multiplier = 1;
        int sum = 0;
        int together = 0;
        ArrayList<Integer> products = new ArrayList<Integer>();
        while(multiplier < 10000)
        {
            multiplicand = 1;
            while(multiplicand<=multiplier)
            {
                product = multiplicand*multiplier;
                together = (int)((int)multiplicand*Math.pow(10,numDigits(multiplier)+numDigits(product))+ (int)multiplier*Math.pow(10,numDigits(product)))+product;
                if(isPandigital(together))
                {
                    System.out.println(product);
                    for(int i = 0; i<products.size();i++)
                    {
                        if(product==products.get(i))
                            product = 0;
                    }
                    products.add(product);
                    sum+=product;
                    
                }
                multiplicand++;    
            }
            multiplier++;
        }
        System.out.println(sum);
        **/
        //pandigital multiple
        /**
        ArrayList<Integer> pandigitalNums = new ArrayList<Integer>();
        for(int i = 100000000; i <10000000000; i++)
        {
            if(isPandigital(i))
                pandigitalNums.add(i);
                
        }
        
        boolean panMultiple = false;
        while(!panMultiple)
        {
            
        }
        **/
        //pandigital prime
        /**
        long max = 0;
        for(long i = 0L; i< 10000000; i++)
        {
            if(Prime.isPrime(i)&&isPandigital(i))
            {
                max = i;
                System.out.println(i);
            }
        }
        
        System.out.println(max);
        **/
        //subString divisibility
        long sum = 0;
        int[] divisors = {2,3,5,7,11,13,17};
        boolean itWorks = true;
        for(long i = 100000000L; i < 10000000000L; i++)
        {
            //System.out.println(i);
            if(isPandigital(i,numDigits(i)))
            {
                System.out.println(i);
                itWorks = true;
                for(int j = 0; j < 7; j++)
                {
                    if(digit(i,j+1,3) % divisors[j] != 0)
                        itWorks = false;
                }
                if(itWorks)
                {
                    sum+=i;
                    //System.out.println(i);
                }
                    
            }
        }
        System.out.println(sum);
    }
}
