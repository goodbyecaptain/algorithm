import edu.princeton.cs.algs4.*;

public class MiscTest
{

    public static void printArray(int[][] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.printf("%4d ", a[i][j]);
            }
            StdOut.println();
        }
    }


    public static int[][] transpose(int[][] a)
    {
        int m = a.length;
        int n = a[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[j][i];
            }
        }

        return result;
    }


    public static void main(String[] args)
    {
    	int[][] a = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = transpose(a);
        printArray(b);

    }
}