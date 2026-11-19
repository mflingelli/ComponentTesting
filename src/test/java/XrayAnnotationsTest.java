import app.getxray.xray.testng.annotations.Requirement;
import app.getxray.xray.testng.annotations.XrayTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;

public class XrayAnnotationsTest {

    @Test
    @XrayTest(key = "CALC-1000")
    @Requirement(key = "CALC-1234")
    public void testAdd() {
        Assert.assertEquals(new SimpleMaths().add(3, 5), 8);
    }

    @Test
    @XrayTest(summary = "Addition of two numbers", description = "Tests the sum of two positive integers.", labels = "Regression")
    @Requirement(key = "CALC-1234")
    public void testAddAttachments() {
        Assert.assertEquals(new SimpleMaths().add(3, 5), 8);

        ITestResult result = Reporter.getCurrentTestResult();
        File attachments[] = new File[] { new File("1.png"), new File("2.png") } ;
        result.setAttribute("attachments", attachments);
    }
}
