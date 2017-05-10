
/**
 * Write a description of class pythagorean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pythagorean
{
    public static boolean isPythagorean(int a, int b, int c)
    {
        return (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2));
    }
    
    public static void main(String []args)
    {
        int a = 0;
        int b = 0;
        int c = 0;

        for(a = 1; a <500; a++)
        {
            for(b = 1; b < 1000-2*a; b++)
            {
                c = (int)(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
                
                if(isPythagorean(a,b,c)&&(a+b+c == 1000))
                    break;
              
           }
           if(isPythagorean(a,b,c)&&(a+b+c == 1000))
                break;
        }

        System.out.println(a*b*c);
    }
}
