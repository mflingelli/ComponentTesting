public class AdvancedMaths {

    public long fac(final long x) {
        if (x < 0) {
            throw new ArithmeticException("Invalid input.");
        } else if (x == 0) {
            return 1;
        } else {
            return x * fac(x - 1);
        }
    }

    public long ackermann(final long m, final long n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

}
