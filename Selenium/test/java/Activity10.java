import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
public class Activity10 {
    WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
//        driver.switchTo().defaultContent();
    }
        @BeforeMethod
        public void beforeMethod(){
                driver.switchTo().defaultContent();
        }
    @Test
    public void simpleAlertTest(){
        WebElement checkInput = driver.findElement(By.id("simple"));
        checkInput.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Reporter.log("Simple Alert done");
    }

    @Test
    public void confrimAlertTest(){
        WebElement checkInput1 = driver.findElement(By.id("confirm"));
        checkInput1.click();
        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();
        Reporter.log("Confirm Alert done");
    }

    @Test
    public void promptAlertTest(){
        WebElement checkInput2 = driver.findElement(By.id("prompt"));
        checkInput2.click();
        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();
        Reporter.log("Prompt Alert done");
    }

   @AfterTest
   public void after(){
        driver.close();
    }
}
