import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleMathsTest {

    @Test(groups = {"Arithmetic"})
    public void testAdd() {
        Assert.assertEquals(new SimpleMaths().add(3, 5), 8);
    }

    @Test(groups = {"Arithmetic"})
    public void testAddNegative() {
        Assert.assertEquals(new SimpleMaths().add(-3, -5), -8);
    }

    @Test(groups = {"Arithmetic"})
    public void testMultiply() {
        Assert.assertEquals(new SimpleMaths().multiply(3, 5), 15);
    }

    @Test(groups = {"Arithmetic"})
    public void testMultiplyNegative() {
        Assert.assertEquals(new SimpleMaths().multiply(-3, -5), 15);
    }

    @Test(groups = {"Arithmetic"})
    public void testDivide() {
        Assert.assertEquals(new SimpleMaths().divide(15, 3), 5);
    }

    @Test(groups = {"Arithmetic"})
    public void testDivideNegative() {
        Assert.assertEquals(new SimpleMaths().divide(-15, -3), 5);
    }

    @Test(groups = {"Arithmetic"},
            expectedExceptions = ArithmeticException.class)
    public void testDivideZero() {
        new SimpleMaths().divide(15, 0);
    }
}
