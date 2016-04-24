import edu.princeton.cs.algs4.*;

public class Fibonacci
{
/*
	public static long F(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
*/

	public static long F(int N) {
		
		if (N == 0) return 0;
		if (N == 1) return 1;
		
		// save computed values in an array
		int[] computedValues = new int[N];
		
		computedValues[0] = 0;
		computedValues[1] = 1;

		for (int i = 2; i < N; i++) {
			computedValues[i] = computedValues[i-1] + computedValues[i-2];
		}
		
		return computedValues[N-1] + computedValues[N-2];
	}

	public static void main(String[] args) {
		for (int N = 0; N < 1000; N++) {
			StdOut.println(N + " " + F(N));
		}
	}
}