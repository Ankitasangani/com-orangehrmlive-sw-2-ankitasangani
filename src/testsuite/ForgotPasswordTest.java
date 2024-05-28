package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * <p>
 * 2. ForgotPasswordTest
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();

        // Verify the text “Reset Password”
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        Assert.assertEquals("Text didn't Match!", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
