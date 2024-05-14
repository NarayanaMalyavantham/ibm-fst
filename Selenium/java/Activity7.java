import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity7 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title of the linked page: " + driver.getTitle());

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();



        WebElement draggable1 = driver.findElement(By.id("draggable"));
        WebElement droppable1 = driver.findElement(By.id("dropzone2"));
        new Actions(driver)
                .dragAndDrop(draggable1, droppable1)
                .perform();

        driver.quit();

    }
}
