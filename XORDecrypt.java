import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class XORDecrypt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class XORDecrypt
{
    public static void main(String[] args) throws IOException
    {
        int[] cipher = scan("p059_cipher.txt");
        int[] decoded = new int[cipher.length];
        //System.out.println(65^42);
        /**
        for(int i = 0; i < cipher.length; i++)
        {
            System.out.println(cipher[i]);
        }
        //97-122
        **/
        
        Scanner input = new Scanner(System.in);
        int stuff = 0;
        int[] index = {97,97,100};
        int counter = 0;
        int total = 0;
        while(stuff ==0)
        {
            
            for(index[1] = 97; index[1] <= 122; index[1]++)
            {
                counter = 0;
                total  = 0;
                for(int i = 0; i< cipher.length; i++)
                {
                    decoded[i] = cipher[i]^index[counter];
                    counter = (counter+1)%3;
                    total += decoded[i];
                    System.out.print((char)decoded[i]);
                }
                
                System.out.println(total);
            }
            index[0]++;
            
            if(index[0] == 123)
            {
                //index[0]++;
                index[0] = 97;
            }
            
            stuff = input.nextInt();
        }
        /*
        index[1] = stuff;
        index[0]--;
        int total = 0;
        if(index[0] == -1)
        {
            index[0] = 122;
            //index[0]--;
        }
        counter = 0;
        for(int i = 0; i< cipher.length; i++)
        {
            total += cipher[i]^index[counter];
            counter = (counter+1)%3;
            System.out.print((char)decoded[i]);
        }
        */
        //System.out.println(ans[stuff]);
    }
    
    public static int[] scan(String fileName) throws IOException
    {
        Scanner joe = new Scanner(new File(fileName));
        int[] cipher = new int[1201];
        //ArrayList temp = new ArrayList();
        String line = "";
        int index = -1;
        int useless = 0;
        int i = 0;
        
        while(joe.hasNext())
        {
            line = joe.next();
            while(index<line.length())
            {
                useless = index+1;
                index = line.indexOf(",",useless);
                if(index < 0)
                {
                    cipher[i]= (Integer.parseInt(line.substring(useless)));
                    index  = line.length();
                    
                }
                else
                    cipher[i] = (Integer.parseInt(line.substring(useless,index)));
                    //System.out.println(index);
                i++;
            }
        }
        //System.out.println(temp.size());
        return cipher;
    }
}
