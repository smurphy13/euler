
/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Palindrome
{
    public static void main(String []args)
    {
        //for palindrome
        /**
        int max = 0;
        int temp = 0;
        for(int i = 999; i > 0; i--)
        {
            for(int j = 999; j > 0; j--)
            {
                if(isPalindrome(i*j))
                {
                    temp = i*j;
                    if(max< temp)
                    {
                        max =temp;
                    }
                }
            }
            
                
        }
        System.out.println(max);
        **/
        
        //for doublebase
        /*
        int sum = 0;
        
        for(int i = 0; i < 1000000; i++)
        {
            if(isPalindrome(i)&&isPalindrome(toBinary(i)))
            {
                //System.out.println(i);
                //toBinary(i).print();
                sum+=i;
            }
                
        }
        System.out.println(sum);
        */
       
        //for Luchrel numbers
        Numbers num = new Numbers();
        int index = 0;
        int ans = 0;
        Numbers temp = new Numbers();
        //long temp = 0;
        //reverse(123456789987654L);
        
        for(int i = 1; i < 10001; i++)
        {
            //temp = reverse(i);
            num = new Numbers(i);
            num.print();
            temp = Numbers.setEqualTo(num);
            temp.reverse();
            num.add(temp);
            index =0;
            temp.print();
                num.print();
            //System.out.println(i+" " + temp+" " + index);
            while(!isPalindrome(num)&&index<50)
            {
                index++;
                //temp = reverse(num);
                temp = Numbers.setEqualTo(num);
                temp.reverse();
                num.add(temp);
                temp.print();
                num.print();
            }
            if(!isPalindrome(num))
            {
                ans++;
                //num.print();
            }
            System.out.println(index);
            //System.out.println(num);
            //System.out.println(i);
        }
        System.out.println(ans);
        
    }
    
    
    public static long reverseL(long num)
    {
        long ans = 0;
        long temp = 0;
        //System.out.println(num);
        for(int i = 0; i < Numbers.numDigits(num); i++)
        {
            temp =(long)Math.pow(10,Numbers.numDigits(num)-i-1)*Numbers.digit(num,i);
            ans += temp;
            //System.out.println(temp+ " "+ ans);
        }
        return ans;
    }
    
    public static Numbers toBinary(int num)
    {
        int index = 64;
        Numbers binary = new Numbers(0);
        while(num > 0)
        {
            
            if(Math.pow(2,index) <= num)
            {
                
                num -= Math.pow(2,index);
                //System.out.println(index+" "+num);
                binary.add(Numbers.pow(10,index));
                //binary.print();
            }
            index--;
            
        }
        return binary;
    }
    
    public static boolean isPalindrome(long num)
    {
        int digits = Numbers.numDigits(num);
        int temp = 0;
        for(int i = 0; i < digits/2; i++)
        {
            temp = Numbers.digit(num,i);
            if(Numbers.digit(num,digits-i-1) != temp)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(Numbers num)
    {
        int temp = 0;
        for(int i = 0; i < num.length()/2; i++)
        {
            temp = num.get(i);
            if(num.get(num.length()-i-1) != temp)
            {
                return false;
            }
        }
        return true;
    }
}
