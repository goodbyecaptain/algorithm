import edu.princeton.cs.algs4.*;

public class NoInitialization
{
	
    public static void main(String[] args)
    {
    	int[] a;
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
    }
}