package trials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://www.wikipedia.org/");

        chromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement dropdown = chromeDriver.findElement(By.id("searchLanguage"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Esperanto");
        select.selectByIndex(0);

        chromeDriver.quit();


    }
}
