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
public class Test3 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @Test
    public void searchInput(){
       WebElement inputUserName= driver.findElement(By.id("username"));
       inputUserName.sendKeys("admin");


    }

    @Test
    public void searchInput1(){
        WebElement inputPassword= driver.findElement(By.id("password"));
        inputPassword.sendKeys("password");

    }
    @Test
    public void searchInput2(){
        WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();
    }
    @Test
    public void searchInput3(){
        WebElement msg=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        String message=msg.getText();
        Assert.assertEquals(message,"Welcome Back, admin");

    }
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }


}
