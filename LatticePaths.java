
/**
 * Write a description of class LatticePaths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LatticePaths
{
    private static int max = 20;
    private static long[][] lattice;
    public static void main(String []args)
    {
        lattice = new long[max][max];
        System.out.println(paths(0,0));
        
    }
    
    public static long paths(int i,int j)
    {
        if(i == max - 1 || j == max - 1)
            return 2*max-i-j;
        else if(lattice[i][j] != 0)
            return lattice[i][j];
        lattice[i][j] = paths(i,j+1)+paths(i+1,j);
        return paths(i,j+1)+paths(i+1,j);
        
    }
}
