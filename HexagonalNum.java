
/**
 * Write a description of class HexagonalNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HexagonalNum extends ShapeNums
{
    public HexagonalNum(int size)
    {
        super(size);
    }
    
    public long ShapeNum(int index)
    {
        return (index*(2*(long)index-1));
    }
    
    public static void main(String[] args)
    {
        //for triangul/hexagonal/pentagonal
        int size = 100000;
        TriangleNum tri = new TriangleNum(size);
        HexagonalNum hex = new HexagonalNum(size);
        PentagonalNum pent = new PentagonalNum(size);
        for(int i = 285; i < size; i++)
        {
            if(hex.binarySearch(tri.get(i))&&pent.binarySearch(tri.get(i)))
            {
                System.out.println(tri.get(i));
                break;
            }
        }
        System.out.println(tri.get(size-1));
        
    }
}
