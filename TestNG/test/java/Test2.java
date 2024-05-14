import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void assertTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Target Practice", title);

    }
    @Test
    public void blackBtn() {

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]")).click();
        Assert.assertEquals("Black","Black");
    }

    @Test(enabled = false)
    public void skippedTest() {
        // This test will be skipped
        System.out.println("This test will be skipped");
    }

    @Test
    public void skipTestWithException() {
        // Skip this test by throwing a SkipException
        throw new SkipException("Skipping this test with exception");
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
