import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Parameters({"a", "b"})
    @Test
    public void testAdd(int x, int y) {
        Assert.assertEquals(new SimpleMath().add(x, y), x + y);
    }

    @Parameters({"a", "b"})
    @Test
    public void testMultiply(int x, int y) {
        Assert.assertEquals(new SimpleMath().multiply(x, y), x * y);
    }
}
