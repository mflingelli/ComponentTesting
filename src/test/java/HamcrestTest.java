import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class HamcrestTest {

    @Test
    public void testAdd() {
        SimpleMath simpleMath = new SimpleMath();
        MatcherAssert.assertThat(simpleMath.add(1, 1), Matchers.greaterThanOrEqualTo(2));
    }

    @Test
    public void testConcating() {
        String value = new SimpleString().concat("Prefix", "Suffix");
        MatcherAssert.assertThat(value, Matchers.containsStringIgnoringCase("suffix"));
    }

    @Test
    public void checkTypeCompatibility() {
        SpecificGeometry specificGeometry = new SpecificGeometry();
        MatcherAssert.assertThat(specificGeometry.getClass(), Matchers.typeCompatibleWith(Geometry.class));
    }

    @Test
    public void testSquareRootOfMinusOneIsNotANumber() {
        MatcherAssert.assertThat(Math.sqrt(-1), Matchers.is(Matchers.notANumber()));
    }
}
