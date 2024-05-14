import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity5 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");

        WebElement url= driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        url.sendKeys("admin");
        WebElement url2= driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        url2.sendKeys("pa$$w0rd");
        WebElement url3= driver.findElement(By.xpath("//*[@id=\"bigbutton\"]"));
        url3.click();

        WebElement url4= driver.findElement(By.cssSelector("html.yui3-js-enabled body.yui-skin-sam div#ajaxHeader nav.navbar.navbar-inverse.navbar-fixed-top div.container-fluid div#toolbar.desktop-toolbar"));
        System.out.println(url4.getCssValue("color"));
        driver.close();

    }
}
