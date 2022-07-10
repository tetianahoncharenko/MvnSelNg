import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Custom_dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
       // driver.findElement(By.xpath("//*[@id = 'example27']")).click();
        WebElement yearLocator = driver.findElement(By.xpath("//*[@id='example27']//..//div//button"));
        yearLocator.click();
        Thread.sleep(2000);
        List<WebElement> countriesList = driver.findElements(By.xpath("//*[@id='example27']//..//div//ul//li//label"));

        for (WebElement li : countriesList) {
            if (li.getText().equals("Python")) {
                System.out.println(li.getText());
//              // Thread.sleep(1000);
                li.click();
            }
            else if (li.getText().equals("Ruby")) {
                System.out.println(li.getText());
               // Thread.sleep(1000);
                li.click();
            }
        }

        //Select dropdown = new Select(yearLocator);
        // List<WebElement> getAll = dropdown.getOptions();
        //  for (WebElement get : getAll) {
        //      System.out.println(get.getText());

        //  }
        driver.close();
    }
}
