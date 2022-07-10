import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw_Get_Css_Value {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement button = driver.findElement(By.cssSelector(".sf-with-ul"));
        System.out.println(button.getCssValue("background-color"));
        button.click();
        System.out.println(button.getCssValue("background"));
        driver.quit();
    }
}
