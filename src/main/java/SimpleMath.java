public class SimpleMath {

    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by 0");
        } else {
            return x / y;
        }
    }
}
