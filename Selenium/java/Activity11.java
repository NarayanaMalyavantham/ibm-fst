import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity11 {
    public static void main(String args[]){
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // getting page's title and print it in console
        String title = driver.getTitle();
        System.out.println(title);

        //Actions builder = new Actions(driver);
        // create wait object

        WebElement checkBox=driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/label"));
        System.out.println(checkBox.isSelected());

        WebElement removeCheckBox= driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        removeCheckBox.click();
       // System.out.println(removeCheckBox.isSelected());
        System.out.println("true");
        driver.quit();
    }
}
