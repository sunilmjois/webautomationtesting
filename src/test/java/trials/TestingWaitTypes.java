package trials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestingWaitTypes {

    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://gmail.com");
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait webDriverWait= new WebDriverWait(firefoxDriver,10);

        firefoxDriver.findElement(By.id("identifierId")).sendKeys("testgig123@gmail.com");
        firefoxDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("123");
        firefoxDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

//        firefoxDriver.close();
//        firefoxDriver.quit();

    }
}
