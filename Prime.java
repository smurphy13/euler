import java.util.ArrayList;
/**
 * Write a description of class Prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prime
{
    public static void main(String []args)
    {
        //for Prime
        /**
        int i = 2;
        int index = 0;
        long sum = 0L;
        //while(index < 10001)
        while(i < 2000000)
        {
            if(isPrime(i))
            {
                //index++;
                sum += i;
            }
            i++;
        }
        //System.out.println(i);
        System.out.println(sum);    
        **/
        
        //for circular prime
        /**
        int index = 0;
        isCircularPrime(197);
        for(int i = 2; i < 1000000;i++)
        {
            if(isCircularPrime(i))
            {
                System.out.println(i);
                index++;
            }
        }
        System.out.println(index);
        **/
        
        //for truncatable primes
        /**
        System.out.println(isTruncatablePrime(3797));
        int index = 0;
        int i = 10;
        int sum = 0;
        while(index<11)
        {
            if(isTruncatablePrime(i))
            {
                index++;
                sum+=i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println(sum);
        **/
        
        //for Golbach's other conjecture
        /**
        boolean goldbach = true;
        int i = 0;
        while(golbach)
        {
        }
        **/
        
        //cosecutive prime sum
        /**
        int size = 78499;
        int[] primes = new int[size];
        int i = 0;
        int j = 1;
        while(j<1000000)
        {
            if(isPrime(j))
            {
                primes[i] = j;
                i++;
            }
            j++;
        }
        int max = 0;
        int temp = 0;
        int answer = 0;
        int num = 0;
        int index = 0;
        //System.out.println("Starts loop");
        for(i = 0; i< size; i++)
        {
            //System.out.println(max);
            for(j = 0; j < i;j++)
            {
                //temp = consecutiveSum(primes[i],primes,j,0);
                index = j;
                temp = 0;
                num = primes[i];
                while(num>0&&index<size)
                {
                    num-=primes[index];
                    index++;
                    temp++;
                    
                }
                
                if(temp > max&&num==0)
                {
                    max = temp;
                    answer = primes[i];
                    j = index;
                    System.out.println(max+" "+primes[i]);
                }
            }
        }
        System.out.println(answer);
        **/
        
        //for distinct prime factors
        /**
        int i = 1;
        ArrayList<Integer> allFactors = new ArrayList<Integer>();
        int required = 4;
        int[] j = new int[required];
        int index = 0;
        
        while(index != required)
        {
            allFactors = Numbers.factors(i);
            j[index] = 0;
            for(int k = 0; k < allFactors.size(); k++)
            {
                if(isPrime(allFactors.get(k)))
                {
                    j[index]++;
                }
            }
            
            if(j[index] == required)
            {
                index++;
            }
            else
                index = 0;
            i++;
        }
        System.out.println(i-required);
        **/
        
        //for prime permutation
        /*
        int[] nums = new int[3];
        for(int i = 1000; i < 10000; i++)
        {
            for(int j = 1; 2*j+i < 10000; j++)
            {
                for(int k = 0; k < 3; k++)
                {
                    nums[k] = i+k*j;
                }
                if(isPrimePermutation(nums))
                {
                    System.out.println(nums[0]+""+nums[1]+""+nums[2]);
                }
            }
        }
        
        //int[] array = {1013,4013,7013};
        //System.out.println(isPrimePermutation(array));
        */
       
        //for prime pair sets
        long[] primes = new long[1000];
        int i = 0;
        long index = 2;
        while(i < 1000)
        {
            if(isPrime(index))
            {
                primes[i] = index;
                i++;
            }
            index++;
        }
        
        i = 0;
        index = 0;
        int j = 0;
        int k = 0;
        //long[] test = {1, 21, 3, 4};
        //System.out.println(combine(test));
        
        while(index< 1000)
        {
            j = 0;
            while(j < 1000)
            {
                long[] temp = {primes[index], primes[j]};
                long[] temp2 = {primes[j], primes[index]};
                if(isPrime(combine(temp))&&isPrime(combine(temp2)))
                {
                    k = 0;
                    while(k < 1000)
                    {
                        temp = {primes[k], primes[j]};
                        temp2 = {primes[index], primes[k]};
                        long[] temp3 = {primes[k], primes[index]};
                        long[] temp4 = {primes[j],primes[k]};
                        long[] temp5 = 
                        if(isPrime(primes[index]+primes[k])&&isPrime(primes[k]+primes[j]))
                        {
                            i = 0;
                            while(i < 1000)
                            {
                                
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static boolean isPrimeRearange(long[] a)
    {
        long[] temp = new long[a.length-1];
        if(!isPrime(comine(a)))
            return false;
        for(int i = 0; i < a.length-1; a++)
        {
            temp[i] = a[i+1];
        }
        if(!isPrimeRearange(temp))
        {
            return false;
        }
        for(int i = 0; i < a.length-2;
    }
    
    public static long combine(long[] a)
    {
        long ans = a[a.length-1];
        for(int i = a.length-2; i >-1; i--)
        {
            ans+= a[i]*Math.pow(10,Numbers.numDigits(ans));
        }
        return ans;
    }
    
    public static boolean isPrimePermutation(int nums[])
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for(int i = 0; i < 4; i++)
        {
            
            digits.add(Numbers.digit(nums[0],i));
        }
        
        if((!isPrime(nums[0])))
                return false;
        for(int i = 1; i < nums.length; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            //System.out.println(Numbers.digit(nums[i],3));
            for(int j = 0; j < 4; j++)
            {
                //System.out.println(digits.get(j));
                temp.add(digits.get(j));
            }
            if((!isPrime(nums[i])))
                return false;
            for(int k = 0; k < 4; k++)
            {
                //System.out.println(k);
                for(int j = 0; j < temp.size(); j++)
                {
                    if(Numbers.digit(nums[i],k)== temp.get(j))
                    {
                        //System.out.println(Numbers.digit(nums[i],k)+ " " +j+" "+k);
                        temp.remove(j);
                        break;
                    }
                    
                    
                }
            }
            if(temp.size() > 0)
                return false;
        }
        return true;
    }
    
    public static boolean isPrime(long num)
    {
        if(num <=1)
            return false;
        for(int j = 2; j <= Math.sqrt(num) ;j++)
        {
            if(num % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isCircularPrime(int num)
    {
        int rotation = num;
        int temp = 0;
        int size =  Numbers.numDigits(num);
        for(int i = 0; i < size;i++)
        {
            if(!isPrime(rotation))
                return false;
            temp = rotation/(int)(Math.pow(10,size-1)); 
            rotation = (int)((rotation%Math.pow(10,size-1))*10)+temp;

        }
        return true;
    }
    
    public static boolean isTruncatablePrime(int num)
    {
        int temp = num;
        int size =  Numbers.numDigits(num);
        for(int i = 0; i < size; i++)
        {
            if(!isPrime(temp))
                return false;
            temp = temp/10;
        }
        
        temp = num;
        for(int i = 0; i < size; i++)
        {
            if(!isPrime(temp))
                return false;
            temp = num%(int)(Math.pow(10,size-i-1));
            //System.out.println(temp);
        }
        
        return true;
    }
}
