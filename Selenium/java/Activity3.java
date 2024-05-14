import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Activity3 {
    public static void main(String args[]){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the linked page: " + driver.getTitle());
        WebElement checkInput=driver.findElement(By.xpath(" //*[@id=\"third-header\"]"));
        WebElement checkInput1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));

        System.out.println(checkInput.getText());
        System.out.println((checkInput1.getCssValue("color")));
        //System.out.println(checkInput1.get);

//        WebElement checkInput2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
//        System.out.println(checkInput2.getCssValue("class"));

        WebElement def =driver.findElement(By.cssSelector(".violet"));
        System.out.println(def.getAttribute("class"));

        WebElement checkInput3=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println(checkInput3.getText());
    }


    }

