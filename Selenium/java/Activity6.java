import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the linked page: " + driver.getTitle());
        new Actions(driver).
                sendKeys("N").perform();

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                        .sendKeys("a")
                                .keyUp(Keys.CONTROL)
                                        .perform();
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                        .sendKeys("c")
                            .keyUp(Keys.CONTROL)
                                    .perform();
        driver.quit();
    }
}
