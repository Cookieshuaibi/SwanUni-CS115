package Labs.Lab7;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        System.out.println(multiply(3, 3) + "\n");

        int n = 47;

        long recStart = System.currentTimeMillis();
        // System.out.println(fib(n));
        long recStop = System.currentTimeMillis();
        // System.out.println(recStop - recStart + "\n");

        recStart = System.currentTimeMillis();
        System.out.println(fibLoop(n));
        recStop = System.currentTimeMillis();
        System.out.println(recStop - recStart + "\n");
    }

    public static int multiply(int a, int b) {
        if (b == 0)
            return 0;
        return a + multiply(a, b - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static int fibLoop(int n) {
        if (n == 0 || n == 1)
            return n;

        // tmp variables to hold prev fib numbers
        int left = 0;
        int right = 1;
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (flag) {
                left += right;
            } else {
                right += left;
            }
            flag = !flag;
        }

        return left + right;
    }
}