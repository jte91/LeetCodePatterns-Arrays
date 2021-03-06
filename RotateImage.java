public class RotateImage 
{
    public void rotate(int[][] matrix) 
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j=i; j<matrix[0].length;j++)
            {
                int holder = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = holder;
            }
        }
        
        for(int i = 0; i<matrix.length; i++)
        {
            int start = 0;
            int end = matrix[0].length - 1;
            while(start < end)
            {
                int holder = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = holder;
                start++;
                end--;
            }
        }
    }
}
