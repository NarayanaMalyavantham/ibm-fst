import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class helloSelenium {
        public static void main(String[] args) {
            // Setup the Firefox driver(GeckoDriver)
            WebDriverManager.firefoxdriver().setup();

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the browser
            //driver.get("https://v1.training-support.net");
            driver.get("https://v1.training-support.net");
            System.out.println("Title of the linked page: " + driver.getTitle());

            WebElement button = driver.findElement(By.id("about-link"));
            button.click();
           System.out.println("Title of the linked page: " + driver.getTitle());

            // Perform testing and assertions

            // Close the browser
            // Feel free to comment out the line below
            // so it doesn't close too quickly
            driver.quit();
        }
    }

