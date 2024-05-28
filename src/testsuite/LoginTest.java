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
 *
 * 1. LoginTest
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Enter Username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        // Enter password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        // Click on Login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Verify the text “Dashboard”
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals("Text didn't Match!", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
