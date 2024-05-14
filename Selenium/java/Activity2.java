import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the linked page: " + driver.getTitle());
        // Clear field to empty it from any previous data
        WebElement emailInput=driver.findElement(By.id("username"));
        emailInput.clear();
        //Enter Text
        String email="admin";
        emailInput.sendKeys(email);
        // Clear field to empty it from any previous data
        WebElement pw=driver.findElement(By.id("password"));
        pw.clear();
        //Enter Text
        String password="password";
        pw.sendKeys(password);
        WebElement checkInput=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        checkInput.click();




    }
}
