import edu.princeton.cs.algs4.*;

public class Euclid
{
    public static int gcd(int p, int q) {
        StdOut.printf("%d,%d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args)
    {
        gcd(1111111, 1234567);
    }
}
