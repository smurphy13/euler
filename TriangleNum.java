import java.util.ArrayList;
/**
 * Write a description of class TriangleNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleNum extends ShapeNums
{
    public TriangleNum(int size)
    {
        super(size);
    }
    
    public long ShapeNum(int index)
    {
        return (index*((long)index+1)/2);
    }
    
    public static void main(String []args)
    {
        /**for triangleNums
        int i = 0;
        int triangleNum = 0;
        boolean loop = true;
        while(loop)
        {
            i++;
            triangleNum += i;
            loop = over(triangleNum);
       
        }
        System.out.println(triangleNum);
        **/
    }
    
    public static boolean over(int triangleNum)
    {
        ArrayList bob = new ArrayList();
        double squareRoot = Math.sqrt(triangleNum);
        for(int i = 1; i < squareRoot;i++)
        {
            if(triangleNum%i == 0)
            {
                bob.add(i);
                bob.add(triangleNum/i);
            }
        }
        if(squareRoot%1 == 0)
        {
            bob.add(squareRoot);
        }
        if(bob.size() > 500)
        {
            return false;
        }
        return true;
    }
}
