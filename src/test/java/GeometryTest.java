import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GeometryTest {

    @DataProvider(name = "radius")
    public Object[] getRadius() {
        return new Object[][] {{10.0, 314.159}, {20.0, 1256.637}};
    }

    @Test(groups = {"Geometry"},
            description = "Shows the usage of the delta parameter.")
    public void getCircleArea() {
        Assert.assertEquals(new Geometry().getCircleArea(1.0), 3.14159, 0.0005);
    }

    @Test(groups = {"Geometry"},
            dataProvider = "radius")
    public void getCircleAreaRadiusFromDataProvider(double radius, double expected) {
        Assert.assertEquals(new Geometry().getCircleArea(radius), expected, 0.005);
    }
}
