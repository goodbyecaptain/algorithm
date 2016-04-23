import edu.princeton.cs.algs4.*;

public class PrintTwoDimArray
{
    public static void main(String[] args)
    {
    	boolean b[][] = new boolean[][] {
    		{true, false, true},
    		{false, true, false},
    		{true, false, true}
    	};
    	StdOut.print("  ");
    	for (int j = 0; j < 3; j++)
    		StdOut.printf("%2d", j + 1);
    	StdOut.println();
    	for (int i = 0; i < 3; i++) {
    		StdOut.printf("%2d", i + 1);
    		for (int j = 0; j < 3; j++) {
    			if (b[i][j] == true)
    				StdOut.print(" *");
    			else
    				StdOut.print(" -");
    		}
    		StdOut.println();
    	}
    }
}
