import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Parameters({"a", "b"})
    @Test
    public void testAdd(@Optional("0") int x, @Optional("0")int y) {
        Assert.assertEquals(new SimpleMaths().add(x, y), x + y);
    }

    @Parameters({"a", "b"})
    @Test
    public void testMultiply(@Optional("0")int x, @Optional("0")int y) {
        Assert.assertEquals(new SimpleMaths().multiply(x, y), x * y);
    }

    @Parameters("radius")
    @Test
    public void testCircleArea(@Optional("3.0") double radius) {
        Assert.assertEquals(new Geometry().getCircleArea(radius), Math.pow(3, 2) * Math.PI, 0.0001);
    }
}
