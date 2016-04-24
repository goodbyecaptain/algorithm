import edu.princeton.cs.algs4.*;

public class LogFactorial
{

	public static double logFact(int N) {
		
		if (N == 0) return 0;
		if (N == 1) return 0;

		return Math.log(N) + logFact(N - 1);
	}

	public static void main(String[] args) {
		for (int N = 0; N < 100; N++) {
			StdOut.printf("%4d\t%g\n", N, logFact(N));
		}
	}
}