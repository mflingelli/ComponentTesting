import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedMathsTest {

    @Test(groups = {"Simple recursion"}, expectedExceptions = ArithmeticException.class)
    public void testNegativeFac() {
        Assert.assertEquals(new AdvancedMaths().fac(-1), 2432902008176640000L);
    }

    @Test(groups = {"Simple recursion"})
    public void testFac() {
        Assert.assertEquals(new AdvancedMaths().fac(20), 2432902008176640000L);
    }

    @Test(groups = {"Advanced recursion"})
    public void testAckermann() {
        Assert.assertEquals(new AdvancedMaths().ackermann(3, 10), 8189);
    }

    @Test(groups = {"Advanced recursion"},
            expectedExceptions = StackOverflowError.class)
    public void testAckermannStackOverflow() {
        Assert.assertEquals(new AdvancedMaths().ackermann(10, 10), 8189);
    }

    @Test(groups = {"Advanced recursion"},
            enabled = false,
            timeOut = 5000,
            expectedExceptions = StackOverflowError.class)
    public void testAckermannDisabled() {
        Assert.assertEquals(new AdvancedMaths().ackermann(20, 10), 8189);
    }
}
