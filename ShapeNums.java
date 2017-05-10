
/**
 * Abstract class ShapeNums - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ShapeNums
{
    public long[] shapeNums;
    public ShapeNums(int size)
    {
        shapeNums = new long[size];        
        for(int i = 0; i< size; i++)
        {
            shapeNums[i] = ShapeNum(i+1);
            //System.out.println(shapeNums[i]);
        }
        
    }
    
    public abstract long ShapeNum(int index);
    
    public boolean binarySearch(long key) {
        int low = 0;
        int high = shapeNums.length -1;
        int mid;
        while (low<=high) {
            mid = (low+high) /2;
            if (shapeNums[mid] > key) 
                high = mid -1;
            else if (shapeNums[mid] < key) 
                low = mid +1;
            else 
                return true;
        }
        return false;
    }
    
    public long get(int index)
    {
        return shapeNums[index];
    }
}
