import java.util.ArrayList;
/**
 * Write a description of class Lexicographic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lexicographic
{
    // instance variables - replace the example below with your own
    private static int j = 0;
    
    private static final int length = 10;
    private static Numbers[] lex;
    public static void main(String []args)
    {
        lex = new Numbers[Numbers.factorial(length,1)];
        for(int i = 0; i < lex.length; i++)
            lex[i] = new Numbers();
        ArrayList<Integer> nums = new ArrayList();
        for(int i = 0; i < length; i++)
            nums.add(i);
        
        loop(nums,0);
        //for(int i = 0; i < lex.length; i++)
        //    lex[i].printBackwards();
        lex[999999].printBackwards();
    }
    
    public static void loop( ArrayList<Integer> nums, int index)
    {
        ArrayList<Integer> temp = new ArrayList();
        if(index < length)
        {
            
            for(int i = 0; i < length- index; i++)
            {
                temp = new ArrayList<Integer>();
                for(int k = 0; k < nums.size(); k++)
                    temp.add(nums.get(k));
                temp.remove(i); 
                
                //System.out.println(i + "  " + index+ "   " + j);
                //System.out.println(nums.get(i));
                for(int k = 0; k < Numbers.factorial(length - index-1,1); k++)
                    lex[j+k].set(index,nums.get(i));
                //lex[j].print();
                loop(temp,index+1);
            }
            
            }
        else
            j++;
    }
    
  
}
    