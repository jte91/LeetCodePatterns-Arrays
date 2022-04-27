public class Convert1DArrayInto2DArray 
{
    public int[][] construct2DArray(int[] original, int m, int n) 
    {
        if(m * n != original.length)
        {
            return new int [][]{};
        }
        int arr[][] = new int [m][n];
        int ind = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = original[ind];
                ind++;
            }
        }return arr;
    }
}
