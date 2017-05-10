import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class maxPyramid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maxPyramid
{
    
    
    
    public static void main(String []args) throws IOException
    {
        /**
        int[][] pyramid = {{75},{95,64}
        ,{17,47,82}
        , {18,35,87,10}
        ,{20 ,04 ,82 ,47, 65}
        ,{19, 01, 23, 75, 03, 34}
        ,{88, 02, 77, 73, 07, 63, 67,}
        ,{99, 65 ,04, 28 ,06, 16, 70, 92}
        , {41 ,41 ,26 ,56 ,83 ,40, 80, 70, 33}
        ,{41 ,48, 72 ,33 ,47 ,32, 37, 16, 94, 29}
        ,{53 ,71, 44, 65 ,25, 
            43, 91, 52, 97, 51 ,14}
        ,{70 ,11, 33 ,28 ,77 ,73, 17 ,78 ,39 ,68 ,17, 57}
         ,{91   ,71 ,52, 38, 17, 14, 91, 43, 58, 50, 27, 29 ,48}
        ,{63 ,66 ,04 ,68, 89 ,53, 67, 30, 73 ,16, 69, 87 ,40, 31} 
        ,{04 ,62, 98 ,27, 23 , 9, 70, 98, 73 ,93, 38 ,53, 60 ,04, 23}};
        
        int maxValue[][] =  {{75},{95,64}
        ,{17,47,82}
        , {18,35,87,10}
        ,{20 ,04 ,82 ,47, 65}
        ,{19, 01, 23, 75, 03, 34}
        ,{88, 02, 77, 73, 07, 63, 67,}
        ,{99, 65 ,04, 28 ,06, 16, 70, 92}
        , {41 ,41 ,26 ,56 ,83 ,40, 80, 70, 33},
        {41 ,48, 72 ,33 ,47 ,32, 37, 16, 94, 29},
        {53 ,71, 44, 65 ,25, 43, 91, 52, 97, 51 ,14},
        {70 ,11, 33 ,28 ,77 ,73, 17 ,78 ,39 ,68 ,17, 57}  
         ,{91   ,71 ,52, 38, 17, 14, 91, 43, 58, 50, 27, 29 ,48},
            {63 ,66 ,04 ,68, 89 ,53, 67, 30, 73 ,16, 69, 87 ,40, 31} ,
            {04 ,62, 98 ,27, 23 , 9, 70, 98, 73 ,93, 38 ,53, 60 ,04, 23}};
        
        //int[][] pyramid = {{3},{7,4},{2,4,6},{8,5,9,3}};
        
        //int maxValue[][] = {{3},{7,4},{2,4,6},{8,5,9,3}};
        **/
        Scanner carl = new Scanner(new File("pyramid2.txt"));
        ArrayList<ArrayList<Integer>> pyramid = scan(carl);
        ArrayList<ArrayList<Integer>> maxValue = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> lastLine = new ArrayList<Integer>();
        for(int i = 0; i < pyramid.size(); i++)
        {
            lastLine.add(pyramid.get(pyramid.size()-1).get(i));
            maxValue.add(lastLine);
        }
        
        for(int i = pyramid.size() - 2; i >= 0; i--)
        {
            for(int j = 0; j < pyramid.get(i).size(); j++)
            {
                if(maxValue.get(i+1).get(j)< maxValue.get(i+1).get(j+1))
                    maxValue.get(i).set(j,maxValue.get(i+1).get(j+1)+pyramid.get(i).get(j));
                else
                    maxValue.get(i).set(j,maxValue.get(i+1).get(j)+pyramid.get(i).get(j));
                //System.out.print(maxValue[i][j] + "  ");
            }
            //System.out.println();
        }
        
        System.out.println(maxValue.get(0).get(0));
    }
       
    
    public static ArrayList<ArrayList<Integer>> scan(Scanner jim)
    {
        int i = 0;
        int j = 0;
        ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();
        String line = "";
        
        
        while(jim.hasNextLine())
        {
            ArrayList<Integer> empty = new ArrayList<Integer>();
            grid.add(empty);
            line = jim.nextLine();
            Scanner joe = new Scanner(line);
            while(joe.hasNextInt())
            {
                grid.get(i).add(joe.nextInt());
            }
            j++;
            i++;
        }


        return grid;
    }
    
}
