public class SimpleMath {

    public int add(final int x, final int y) {
        return x + y;
    }

    public int multiply(final int x, final int y) {
        return x * y;
    }

    public int divide(final int x, final int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by 0");
        } else {
            return x / y;
        }
    }
}
