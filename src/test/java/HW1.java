import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement button = driver.findElement(By.cssSelector(".sf-with-ul"));
        System.out.println(button.getCssValue("background-color"));
        button.click();
        Thread.sleep(1000);
        System.out.println(button.getCssValue("background"));
        driver.quit();



//        WebElement button = driver.findElement(By.cssSelector(".btn"));
//        System.out.println("Submit button is disabled" + button.getAttribute(""));
//        driver.findElement(By.id("firstName")).sendKeys("name");
//        driver.findElement(By.id("lastName")).sendKeys("lastName");
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(".btn")).click();
//        System.out.println("Submit button is enabled" + button.getAttribute(""));
//        driver.close();
//        driver.get("https://html.com/attributes/button-disabled/");
//        WebElement newButton = driver.findElement(By.cssSelector("You can't click me."));
//        System.out.println("Button is disabled" + newButton.getAttribute(""));
//        driver.close();
    }
}
