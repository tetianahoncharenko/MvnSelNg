import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_method {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstName.sendKeys("Tetiana");
        String text = firstName.getAttribute("value");
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.sendKeys("Honcharenko");
        for (int i=text.length()-1; i>0; i--){
            firstName.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(2000);
        }
        driver.close();
    }
}