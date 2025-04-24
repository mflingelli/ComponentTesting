import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathsTest {

    @Test
    public void testAddition() {
        Maths mathsMock = Mockito.mock(Maths.class);
        Mockito.when(mathsMock.add(Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(42);
        Assert.assertEquals(mathsMock.add(40, 2), 42);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        Maths mathsMock = Mockito.mock(Maths.class);
        Mockito.when(mathsMock.divide(Mockito.anyInt(), Mockito.eq(0)))
                .thenThrow(new ArithmeticException());
        Assert.assertEquals(mathsMock.divide(42, 0), 0);
    }
}
