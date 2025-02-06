import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleMathTest {

    @Test(groups = {"Arithmetic"})
    public void testAdd() {
        Assert.assertEquals(new SimpleMath().add(3, 5), 8);
    }

    @Test(groups = {"Arithmetic"})
    public void testAddNegative() {
        Assert.assertEquals(new SimpleMath().add(-3, -5), -8);
    }

    @Test(groups = {"Arithmetic"})
    public void testMultiply() {
        Assert.assertEquals(new SimpleMath().multiply(3, 5), 15);
    }

    @Test(groups = {"Arithmetic"})
    public void testMultiplyNegative() {
        Assert.assertEquals(new SimpleMath().multiply(-3, -5), 15);
    }

    @Test(groups = {"Arithmetic"})
    public void testDivide() {
        Assert.assertEquals(new SimpleMath().divide(15, 3), 5);
    }

    @Test(groups = {"Arithmetic"})
    public void testDivideNegative() {
        Assert.assertEquals(new SimpleMath().divide(-15, -3), 5);
    }

    @Test(groups = {"Arithmetic"},
            expectedExceptions = ArithmeticException.class)
    public void testDivideZero() {
        new SimpleMath().divide(15, 0);
    }
}
