import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import suiteExample.data.*;


public class Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }


    @Test(dataProvider = "loginData",dataProviderClass = dataClass.class)//dataProviderClass = dataClass.class
    public void testMethod(String sFirstName, String sLastName, String sEmail, String sMobile, String sMessage){
        WebElement FN = driver.findElement(By.id("firstName"));
        FN.sendKeys(sFirstName);

        WebElement LN = driver.findElement(By.id("lastName"));
        LN.sendKeys(sLastName);

        WebElement EM = driver.findElement(By.id("email"));
        EM.sendKeys(sEmail);

        WebElement MN = driver.findElement(By.id("number"));
        MN.sendKeys(sMobile);

        WebElement MS = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
        MS.sendKeys(sMessage);

        WebElement checkInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input"));
        checkInput.click();

//        WebElement clearInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[2]/input"));
//        clearInput.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @AfterMethod (alwaysRun = true)
    public void afterMethod(){
        driver.close();
    }
}
