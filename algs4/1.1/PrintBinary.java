import edu.princeton.cs.algs4.*;

public class PrintBinary
{
	public static String toBinary(int N) 
	{
		String s = "";
    	for (int n = N; n > 0; n /= 2)
    	{
    		s = (n % 2) + s;
    	}
    	return s;
	}
    public static void main(String[] args)
    {
    	int N = 10;
    	StdOut.println(toBinary(N));
    }
}