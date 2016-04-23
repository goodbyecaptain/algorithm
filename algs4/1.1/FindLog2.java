import edu.princeton.cs.algs4.*;

public class FindLog2
{
    public static int lg(int N)
    {
        int i = 0;
        int r = 1;
        while (2 * r <= N) {
            r *= 2;
            i++;
        }

        return i;
    }

    public static void main(String[] args)
    {
        StdOut.println(lg(2));
        StdOut.println(lg(10));	
        StdOut.println(lg(15));
        StdOut.println(lg(18));

    }
}