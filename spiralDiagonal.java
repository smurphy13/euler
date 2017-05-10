
/**
 * Write a description of class spiralDiagonal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spiralDiagonal
{
    static int[][] grid = new int[101][101];
    static int index = 1;
    static int indexX = grid.length/2;
    static int indexY = grid.length/2;
    public static void main(String[] args)
    {
        
        
        
        //for spiral diagonals sum
        /*
        int size 
        int sum = 0;
        int[][] grid = spiral(10001);
        int j = 0;
        for( int i =0; i <size;i++)
        {
            sum+=grid[i][j]+grid[size-1-i][j];
            j++;
        }
        System.out.println(sum);
        */
       
        //for spiral primes
        /*
        int size = 3;
        double ratio = 1;
        int amount = 0;
        while(ratio>.1)
        {
            //int[][] grid = spiral(size);
            spiral(size);
            amount = 0;
            int j = 0;;
            for(int i =0; i <grid.length;i++)
            {
                if(Prime.isPrime(grid[i][j]))
                {
                    amount++;
                    //System.out.print(grid[i][j]+" ");
                }
                if(Prime.isPrime(grid[grid.length-i-1][j]))
                {
                    amount++;
                    
                }
                //System.out.print(grid[grid.length-1-i][j]+" "+(grid.length-1-i)+" "+j+" ");
                j++;
            }
            ratio = (double)amount/(size*2-1);
            System.out.println(size+" "+ratio+" "+amount);
            size+=2;
        }
        System.out.println(size-2);
        */
        
        int primes = 3;
        int size = 3;
        while((double)primes/(size*2-1)>.1)
        {
             size+=2;
             for(int i = 1; i < 4; i++)
             {
                 if(Prime.isPrime((long)Math.pow(size,2)-(size-1)*i))
                    primes++;
             }
        }
        System.out.println(primes/(size*2-1)+" "+size);    
         
        //System.out.println(size-1);
        /*
        int size = 7;
        spiral(size);
        for(int k = -(size)/2; k <= (size)/2; k++)
        {
            for(int l = -(size)/2; l <= (size)/2; l++)
            {
                System.out.print(grid[grid.length/2+k][grid.length/2+l]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        
        size = 13;
        spiral(size);
        for(int k = -(size)/2; k <= (size)/2; k++)
        {
            for(int l = -(size)/2; l <= (size)/2; l++)
            {
                System.out.print(grid[grid.length/2+k][grid.length/2+l]+ " ");
            }
            System.out.println();
        }
        
        */
    }
    
    public static void spiral(int size)
    {
        int dirrection = 1;
        
        //long index = 1;
        //long temp[][] = new long[size][size];
       
        
        //int i = size/2;

        //int i = indexX-grid.length/2;
        //int j = indexY-grid.length/2;
        
        while(indexX!=grid.length/2-size/2||indexY!=grid.length/2+size/2)
        {
            grid[indexX][indexY] = index;
            index++;
            if(dirrection == 1)
            {
                indexY++;
                
                if(grid[indexX+1][indexY] == 0)
                {
                    dirrection++;          
                    //System.out.println(indexX+" "+indexY+" "+index);
                }
            }
            else if(dirrection == 2)
            {
                indexX++;
                
                if(grid[indexX][indexY-1] == 0)
                {
                    dirrection++;          
                    //System.out.println(indexX+" "+indexY+" "+index);
                }                  
            }
            else if(dirrection == 3)
            {
                indexY--;
                if(grid[indexX-1][indexY] == 0)
                {
                    dirrection++;          
                    //System.out.println(indexX+" "+indexY+" "+index);
                }                  
            }
            else
            {
                indexX--;
                if(grid[indexX][indexY+1] == 0)
                {
                    dirrection=1;          
                    //System.out.println(indexX+" "+indexY+" "+index);
                }                    
            }
            //System.out.println(i+" "+indexX+" "+j+" "+indexY+" "+index);
        }
        //indexX += i;
        //indexY += j;
        grid[indexX][indexY] = index;
        /*
        grid[i][j] = index;
        if(initialX =! size/2)
        {
            for(int k = 0; k < grid.length; k++)
            {
                for(int r = 0; r<grid.length[k];k++)
                {
                    
                }
            }
        }
        return grid;
        */
    }
}
