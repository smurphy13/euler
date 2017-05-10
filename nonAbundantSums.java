
/**
 * Write a description of class nonAbundantSums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class nonAbundantSums extends Numbers
{
    public static ArrayList<Integer> abundant()
    {
        ArrayList<Integer> abundant = new ArrayList<Integer>();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 12; i < 28123; i++)
        {
            factors = factors(i);
            sum = 0;
            for(int j = 0; j < factors.size(); j++)
            {
                sum+=factors.get(j);
            }
            if(sum - i > i)
            {
                abundant.add(i);
 
            }
        }
        return abundant;
    }
    
    public static void main(String []args)
    {
        int sum = 0;
        boolean nonAbundant = true;
        ArrayList<Integer> abundantNums = abundant();
        ArrayList<Integer> sums = abundantSums(abundantNums);
        
        for(int i = 0; i < sums.size();i++)
        {
            System.out.println(sums.get(i));
        }
        
        for(int i = 1; i <= 28123; i++)
        {
            nonAbundant = true;
            if(i == sums.get(0))
            {
                sums.remove(0);
            }
            else
                sum+=i;
        }
        System.out.println(sum);
    }
             
    public static ArrayList<Integer> abundantSums(ArrayList<Integer> abundantNums)
    {
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for(int i = 0; i < abundantNums.size();i++)
        {
            for(int j = i; j < abundantNums.size();j++)
            {
                sums.add(abundantNums.get(i)+abundantNums.get(j));
            }
        }
        System.out.println("Before sorted"+ " "+ sums.size());
        quickSort(0,sums.size()-1,sums);
        System.out.println("After sorted");
        sums = removeRepeats(sums);
        System.out.println("After unique");
        return sums;
    }
    
    public static ArrayList<Integer> removeRepeats(ArrayList<Integer> nums)
    {
        int temp = 0; 
        for(int i = nums.size()-1;i <= 0;i--)
        {
            if(nums.get(i) == temp)
                nums.remove(i);
            else
                temp = nums.get(i);
        }
        return nums;
    }
    
    private static void quickSort(int left,int right,ArrayList<Integer> a){         
        // If both cursor scanned the complete array quicksort exits
        if(left >= right)
            return;         
        // For the simplicity, we took the right most item of the array as a pivot 
        int pivot = a.get(right);
        int partition = partition(left, right, pivot,a);
         
        // Recursively, calls the quicksort with the different left and right parameters of the sub-array
        quickSort(0, partition-1,a);
        quickSort(partition+1, right,a);
    }
     
    // This method is used to partition the given array and returns the integer which points to the sorted pivot index
    private static int partition(int left,int right,int pivot,ArrayList<Integer> a){
        int leftCursor = left-1;
        int rightCursor = right;
        while(leftCursor < rightCursor){
                while(a.get(++leftCursor) < pivot);
                while(rightCursor > 0 && a.get(--rightCursor) > pivot);
            if(leftCursor >= rightCursor){
                break;
            }
            else{
                swap(leftCursor, rightCursor,a);
            }

        }
        swap(leftCursor, right,a);
        return leftCursor;
    }

     

    // This method is used to swap the values between the two given index

    public static void swap(int left,int right,ArrayList<Integer> a){
        int temp = a.get(left);
        a.set(left,a.get(right));
        a.set(right, temp);
    }

}
        
    

