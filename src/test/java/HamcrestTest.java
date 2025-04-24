import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HamcrestTest {

    @Test
    public void testAdd() {
        SimpleMaths simpleMath = new SimpleMaths();
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

    @Test
    public void testCloseTo() {
        Geometry geometry = new Geometry();
        MatcherAssert.assertThat(geometry.getCircleArea(1), Matchers.closeTo(3, 0.5));
    }

    @Test
    public void mapHasKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        MatcherAssert.assertThat(map, Matchers.hasKey("key"));
    }

    @Test
    public void mapHasValue() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        MatcherAssert.assertThat(map, Matchers.hasValue("value"));
    }

    @Test
    public void mapHasEntry() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        MatcherAssert.assertThat(map, Matchers.hasEntry("key", "value"));
    }

    @Test
    public void checkPropertyLastname() {
        Person person = new Person();
        MatcherAssert.assertThat(person, Matchers.hasProperty("lastname"));
    }

    @Test
    public void checkPropertyLastnameWithValue() {
        Person person = new Person("John", "Doe");
        MatcherAssert.assertThat(person, Matchers.hasProperty("lastname", Matchers.is("Doe")));
    }
}
