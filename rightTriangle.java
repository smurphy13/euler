
/**
 * Write a description of class rightTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rightTriangle
{
    public static void main(String[] args)
    {
        int max = 0;
        int temp = 0;
        int ans = 0;
        /**
        for(int i = 0; i <= 1000; i++)
        {
            temp = solutions(i);
            System.out.println(temp);
            if(temp>max)
            {
                max = temp;
                ans = i;
            }
        }
        **/
        System.out.println(solutions(12));
        System.out.println(ans);
    }
    
    public static int solutions(int perimeter)
    {
        int a = 1;
        int b = 1;
        int c = perimeter-2;
        int total = 0;
        while(a<perimeter/2-1)
        {
            b=1;
            while(b<=a)
            {
                c = (int)(Math.pow(a,2)+Math.pow(b,2));
                System.out.println(a+" "+ b+" "+c);
                if(isRightTriangle(a,b,c))
                    total++;
                b++;
            }
            a++;
        }
        return total;
    }
    
    public static boolean isRightTriangle(int a, int b, int c)
    {
        return Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2);
    }
}
