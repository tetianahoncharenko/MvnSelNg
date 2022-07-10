import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class Hw_three_dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        WebElement yearLocator = driver.findElement(By.xpath("//*[@placeholder='Year']"));
        yearLocator.click();
        Thread.sleep(2000);
        Select dropdown= new Select(yearLocator);
        List<WebElement> getAll = dropdown.getOptions();
        for (WebElement get : getAll) {
            get.click();
            System.out.println(get.getText());

        }
        dropdown.selectByVisibleText("2010");
        System.out.println(dropdown.getFirstSelectedOption());
        driver.close();
    }
}
