import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numbers 
{
    private int[] extralong;
    public Numbers()
    {
        extralong = new int[1];
        extralong[0] = 1;
    }
    public Numbers(int num)
    {
        extralong = new int[numDigits(num)];
        for(int i = 0; i < extralong.length; i++)
        {
            extralong[i] = digit(num,i);
        }
    }
    
    public int length()
    {
        return extralong.length;
    }
   
    public static Numbers[] scan(Scanner joe)
    {
        
        ArrayList<String> lines = new ArrayList<String>();
        
        while(joe.hasNextLine())
        {
            lines.add(joe.nextLine());
        }
        Numbers[] nums = new Numbers[lines.size()];
        for(int i = 0; i < lines.size(); i++)
        {
            nums[i] = new Numbers();
            for(int j = 0; j < lines.get(i).length(); j++)
            {
                nums[i].set(lines.get(i).length()-j-1,Integer.valueOf(lines.get(i).substring(j,j+1)));
            }
        }
        return nums;
    }
    
    public void reverse()
    {
        int[] temp = new int[extralong.length];
        for(int i=0; i <extralong.length;i++)
        {
            temp[i] = extralong[extralong.length-i-1];
        }
        extralong = temp;
       
    }
    
    public int get(int index)
    {
        return extralong[index];
    }
    
    /**
    public void multiply(Numbers num)
    {
        Numbers temp[] = new Numbers[];
        for(int i = 0; i < length(); i++)
        {
            
        }
    }
    **/
    public void multiply(int num)
    {
        int temp[] = new int[extralong.length];
        int sums[] = new int[extralong.length+numDigits(num)+1];
        for(int i = 0; i < extralong.length; i++)
        {
            temp[i] = extralong[i] * num;
            for(int j = 0; j < numDigits(temp[i]); j++)
            {
                sums[i+j] += digit(temp[i],j);
                if(sums[i+j] > 9)
                {
                    sums[i+j]-=10;
                    sums[i+j+1]++;
                }
                //System.out.println(sums[i+j]+" "+ i+" "+j);
            }
        }
        /**
        for(int i = 0; i < sums.length; i++)
        {
            System.out.println(sums[i]);
        }
        **/
        extralong = sums;
        removeZerosInFront();
        
        
        
    }
    
    public Numbers product(int num)
    {
        int temp[] = new int[extralong.length];
        int sums[] = new int[extralong.length+numDigits(num)+1];
        for(int i = 0; i < extralong.length; i++)
        {
            temp[i] = extralong[i] * num;
            for(int j = 0; j < numDigits(temp[i]); j++)
            {
                sums[i+j] += digit(temp[i],j);
            }
        }
        
        Numbers ans = new Numbers();
        for(int j = 0; j < sums.length; j++)
        {
            ans.set(j,sums[j]);
        }
        ans.removeZerosInFront();
        return ans;
        
        
        
    }
    
    public static Numbers pow(int num, int power)
    {
        Numbers pow = new Numbers();
        
        for(int i = 0; i < power; i++)
        {
            pow.multiply(num);
            //pow.print();
        }
        return pow;
    }
    
    public void removeZerosInFront()
    {
        int i = extralong.length-1;
        while(extralong[i] == 0)
        {
            i--;
            //System.out.println(i);
        }
        i++;
        int[] temp = new int[i];
        for(int j = 0; j < i; j++)
            temp[j] = extralong[j];
        extralong = temp;
    }
    
    public void add(Numbers num)
    {
        int sum = 0;
        int i = 0;
        int size = 0;
        int temp = 0;
        if(length() > num.length())
            size = length()+1;
        else
            size = num.length()+1;
       
        int[] array = new int[size];
        
        while(i<length()&&i<num.length())
        {
           
            sum = extralong[i] + num.get(i)+temp;
            temp = sum / 10;
            array[i] = sum%10;
            i++;
        }
        
        if(i == num.length()&& i != length())
        {
            array[i] = temp + extralong[i];
            i++;
            
            while(i<length())
            {
                array[i] = extralong[i];
                i++;
            }
        }
        else if(i != num.length()&& i== length())
        {
            array[i] = temp + num.get(i);
            i++;
            while(i<num.length())
            {
                array[i] = num.get(i);
                i++;
            }
        }
        else
            array[i] = temp;
        
        extralong = array;
        removeZerosInFront();
    }
    public void add(long num)
    {
        int sum = 0;
        int i = 0;
        int size = 0;
        int temp = 0;
        if(length()>numDigits(num))
            size = length()+1;
        else
            size = numDigits(num)+1;

       
        int[] array = new int[size];
        
        while(i<length()&&i<numDigits(num))
        {
           
            sum = extralong[i] + digit(num,i)+temp;
            temp = sum / 10;
            array[i] = sum%10;
            i++;
        }
        if(i == numDigits(num)&& i != length())
        {
            array[i] = temp + extralong[i];
            i++;
            
            while(i<length())
            {
                array[i] = extralong[i];
                i++;
            }
        }
        else if(i != numDigits(num)&& i== length())
        {
            array[i] = temp + digit(num,i);
            i++;
            while(i<numDigits(num))
            {
                
                array[i] = digit(num,i);
                i++;
            }
        }
        else
            array[i] = temp;
        extralong = array;
        removeZerosInFront();
        
    }
        
    public Numbers sum(Numbers num)
    {
        int sum = 0;
        int i = 0;
        int size = 0;
        int temp = 0;
        if(length() > num.length())
            size = length()+1;
        else
            size = num.length()+1;
       
        int[] array = new int[size];
        
        while(i<length()&&i<num.length())
        {
           
            sum = extralong[i] + num.get(i)+temp;
            temp = sum / 10;
            array[i] = sum%10;
            i++;
        }
        
        if(i == num.length()&& i != length())
        {
            array[i] = temp + extralong[i];
            i++;
            
            while(i<length())
            {
                array[i] = extralong[i];
                i++;
            }
        }
        else if(i != num.length()&& i== length())
        {
            array[i] = temp + num.get(i);
            i++;
            while(i<num.length())
            {
                array[i] = num.get(i);
                i++;
            }
        }
        else
            array[i] = temp;
            
        Numbers ans = new Numbers();
        for(int j = 0; j < array.length; j++)
        {
            ans.set(j,array[j]);
        }
        ans.removeZerosInFront();
        return ans;
    }
    
    public static int digit(long num, int index)
    {
        return (int)((num% Math.pow(10,index+1))/ Math.pow(10,index));
    }
    public static int digit(long num, int index,int amount)
    {
        int digits = 0;
        for(int i = 0; i < amount; i++)
        {
           digits = (int)((num% Math.pow(10,index+1)/ Math.pow(10,index))*Math.pow(10,amount-i-1));
         }
         return digits;
    }
    
    public static int numDigits(long num)
    {
        int digits = 0;
        while(num > 0)
        {
            num = num / 10;
            digits++;
            
        }
        return digits;
    }
    
    public boolean isEqual(Numbers other)
    {
        if(other.length()!=length())
            return false;
        for(int i = 0; i < length(); i++)
        {
            if(extralong[i]!=other.get(i))
                return false;
        }
        return true;
    }
    
    public static ArrayList<Integer> factors(int num)
    {
        ArrayList<Integer> bob = new ArrayList<Integer>();
        for(int i = 1; i < Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                bob.add(i);
                bob.add(num/i);
            }
        }
        if(Math.sqrt(num) % 1 == 0)
            bob.add((int)(Math.sqrt(num)));
        return bob;
    }
    
    public static Numbers factorial(int n)
    {
        Numbers factorial = new Numbers();
        while(n > 0)
        {
            factorial.multiply(n);
            n--;
        }
        return factorial;
    }
    public static int factorial(int n, int useless)
    {
        int factorial = 1;
        while(n > 0)
        {
            factorial = factorial *n;
            n--;
        }
        return factorial;
    }
    
    public static boolean isPrime(int num)
    {
        return factors(num).size() == 2;
    }
    
    public static Numbers setEqualTo(Numbers blah)
    {
        Numbers ans = new Numbers(0);
        ans.add(blah);
        return ans;
    }
    
    public int total()
    {
        int total = 0;
        for(int i = 0; i < extralong.length; i++)
        {
            total += extralong[i];
        }
        return total;
    }
    
    public void print()
    {
        for(int i = extralong.length - 1; i >= 0; i--)
            System.out.print(extralong[i]);
        System.out.println();
    }
    
    public void printBackwards()
    {
        for(int i = 0; i < extralong.length; i++)
            System.out.print(extralong[i]);
        System.out.println();
    }
    
    public void set(int index, int digit)
    {
        if(extralong.length <= index)
        {
            int temp[] = new int[index+1];
            for(int i = 0; i < extralong.length; i++)
            {
                temp[i] = extralong[i];
            }
            extralong = temp;
        }
        extralong[index] = digit;
    }
    
    public static boolean isPermutation(int nums[])
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int amount = numDigits(nums[nums.length-1]);
        for(int i = 0; i < amount; i++)
        {
            
            digits.add(Numbers.digit(nums[nums.length-1],i));
        }
        for(int i = 0; i < nums.length; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            //System.out.println(Numbers.digit(nums[i],3));
            for(int j = 0; j < amount; j++)
            {
                //System.out.println(digits.get(j));
                temp.add(digits.get(j));
            }
            
            for(int k = 0; k < amount; k++)
            {
                //System.out.println(k);
                for(int j = 0; j < temp.size(); j++)
                {
                    if(Numbers.digit(nums[i],k)== temp.get(j))
                    {
                        System.out.println(Numbers.digit(nums[i],k)+ " " +j+" "+k);
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
    
    
    
    //for factorial
    public static void main(String []args) throws IOException
    {
        
        
        //for factorial
        /**Numbers fac = factorial(100);
        
        fac.print();
        System.out.println("    "  + fac.total());**/
        
       
        
        //for large sum
        /**
        File joe = new File("sum.txt");
      
        Scanner nums = new Scanner(joe);
        Numbers[] sum = scan(nums);
        Numbers temp = new Numbers();
        for(int i = 0; i < sum.length; i++)
        {
            temp.add(sum[i]);
        }
        
        
        temp.print();
        **/
        
        //for power
        /**
        Numbers ans = pow(2,1000);
        ans.print();
        System.out.println(ans.total());
        **/
        
        //largest product in a series
        /**
        File bob = new File("productSeries.txt");
        Scanner nums = new Scanner(bob);
        Numbers[] temp = scan(nums);
        Numbers series = temp[0];
        long max = 0;
        long product = 0;
        int size = 13;
        for(int i = 0; i < series.length() - size; i++)
        {
            product = 1;
            for(int j = 0; j < size; j++)
            {
                product = product* series.get(j+i);
            }
            if(product > max)
                max = product;                
        }
        System.out.println(max);
        **/
        //self powers
        /**
        Numbers selfPower = new Numbers();
        for(int i = 2; i < 1001; i++)
        {
            System.out.println(i);
            selfPower.add(pow(i,i));
        }
        selfPower.print();
        selfPower.length();
        **/
        //powerful digit sum
        
        
        int max = 0;
        int digits = 0;
        Numbers power = new Numbers();
        for(int i = 1; i < 101; i++)
        {
            for(int j = 1; j < 101; j++)
            {
                power = pow(i,j);
                digits = power.total();
                if(digits>max)
                    max = digits;
                    
            }
        }
       
        System.out.println(max);
        
    }
    
}
