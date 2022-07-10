import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        int number = driver.findElements(By.xpath("//*[@class= 'header-menu']/ul[@class = 'top-menu']/li")).size();
        System.out.println("The number of available options is  " + number);
        driver.quit();
    }
}