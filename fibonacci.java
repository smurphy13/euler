
/**
 * Write a description of class fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibonacci extends Numbers
{
    //for first fibonacci problem
    /**
    public static void main(String[]args)
    {
        int num = 1;
        int sum = 0;
        int temp = 0;
        int before = 1;
        while(num < 4000000)
        {
            
            if(num % 2 == 0)
            {
                sum = sum +num;
            }
              
            temp = num;
            num = before + num;
            before = temp;
        }
        System.out.println(sum);
        
    }
    **/
    
    //for 1000 digit fibinocci number
    public static void main(String[] args)
    {
        Numbers num = new Numbers(1);
        Numbers sum = new Numbers(0);
        Numbers temp = new Numbers();
        Numbers before = new Numbers(1);
        long i = 2;
        while(num.length() < 1000)       
        {
             
            temp = num.product(1);
            num.add(before);
            before = temp.product(1);
            //System.out.println(i);
            //num.print();
            i++;
        }//
                    System.out.println(i);
    }
}
