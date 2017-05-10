
/**
 * Write a description of class coinSums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coinSums
{
    private static int[] coins = {200,100,50,20,10,5,2,1};
    private static int total = 0;
    public static void main(String[]args)
    {
        coins(0,0);
        System.out.println(total);
    }
    
    public static void coins(int index,int money)
    {

        if(index<coins.length)
        {
            while(money<=200)
            {
                coins(index+1,money);
                money+=coins[index];
                if(money==200)
                {
                    System.out.println(total);
                    total++;
                }
            }
        }
        
    }
}
