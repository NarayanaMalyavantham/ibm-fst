import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class Activity2 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
       WebElement url= driver.findElement(By.xpath("/html/body/div[1]/div[1]/a"));
        String url1=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();
    }
}
