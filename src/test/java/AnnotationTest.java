import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
    private SimpleMath simpleMathBeforeMethod;
    private SimpleMath simpleMathBeforeGroups;

    @BeforeMethod(description = "This method is called before every test call.")
    public void initSimpleMathBeforeMethod() {
        simpleMathBeforeMethod = new SimpleMath();
    }

    @BeforeGroups(groups = {"Annotations"},
            description = "This method is called before the first call of method of this group.")
    public void initSimpleMathBeforeGroups() {
        simpleMathBeforeGroups = new SimpleMath();
    }

    @Test(groups = {"Annotations"})
    public void testInitializedSimpleMath() {
        Assert.assertNotNull(simpleMathBeforeMethod);
        System.out.println("Reference ID of simpleMathBeforeMethod: " + simpleMathBeforeMethod);
        System.out.println("Reference ID of simpleMathBeforeGroups: " + simpleMathBeforeGroups);
    }

    @Test(groups = {"Annotations"})
    public void testAdd() {
        Assert.assertEquals(simpleMathBeforeMethod.add(1, 2), 3);
        System.out.println("Reference ID of simpleMathBeforeMethod: " + simpleMathBeforeMethod);
        System.out.println("Reference ID of simpleMathBeforeGroups: " + simpleMathBeforeGroups);
    }
}
