
/**
 * Write a description of class multiples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class multiples
{
    public static void main(String[]args)
    {
        /**
        int total=0;
        int multiple = 0;
        while(multiple < 1000)
        {
            total=total+multiple;
            multiple= multiple+3;
            
        }
        
        multiple = 0;
        while(multiple < 1000)
        {
            if(multiple%3 != 0)
            {
                total = total+multiple;
                
            }
            multiple= multiple+5;
        }
        
        System.out.println(total);
        **/
        
        
        int i = 1;
        int[] multiples = new int[6];
        for(int j = 1; j < 7; j++)
        {
            multiples[j-1] = j;
        }
        while(!Numbers.isPermutation(multiples))//&&i<100)
        {
            for(int j = 1; j < 7; j++)
            {
                multiples[j-1] = i *j;
                System.out.print(multiples[j-1]+ " ");
            }
            System.out.println();
            i++;
        }
        
       
    }
}
