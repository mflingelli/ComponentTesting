import org.testng.Assert;
import org.testng.annotations.Test;


public class RelationsTest {

    @Test(groups = {"Relations"})
    public void testGreaterThan() {
        Assert.assertTrue(new Relations().isGreaterThan(10, 9));
    }

    @Test(groups = {"Relations"})
    public void testNotGreaterThan() {
        Assert.assertFalse(new Relations().isGreaterThan(1, 9));
    }
}
