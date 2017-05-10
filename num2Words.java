
/**
 * Write a description of class num2Words here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num2Words extends Numbers
{
    public static void main(String []args)
    {
        int[] single = {0,3,3,5,4,4,3,5,5,4};
        int[] teens = {3,6,6,8,8,7,7,9,8,8};
        int[] ys = {0,0,6,6,5,5,5,7,6,6};
        int hundred = 7;
        int and = 3;
        int total = 0;
        int[] digits = new int[3];
        long numTotal = 0;
        for(int i = 1; i <= 999; i++)
        {
            numTotal = 0;
            for(int j = 0; j < 3; j++)
            {
                if(j < numDigits(i))
                {
                    digits[j] = digit(i,j);
                }
                else
                    digits[j] = 0;
            }
            if(digits[2] != 0)
            {
                numTotal+= single[digits[2]]+hundred;
                if(digits[0] != 0 || digits[1] != 0)
                    numTotal+=and;
            }
            if(digits[1] != 1)
                numTotal += single[digits[0]]+ ys[digits[1]];
            else
                numTotal += teens[digits[0]];
            total += numTotal;
        }
        
        total += 11;
        System.out.println(total);
    }
}
