import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void checkSurname() {
        Person person = new Person();
        person.setSurname("John");
        Assert.assertEquals(person.getSurname(), "John");
    }

    @Test
    public void checkName() {
        Person person = new Person();
        person.setLastname("Doe");
        Assert.assertEquals(person.getLastname(), "Doe");
    }
}
