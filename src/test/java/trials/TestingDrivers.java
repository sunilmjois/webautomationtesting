package trials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestingDrivers {

    public static void main(String[] args) {

        //Setup Firefox(gecko) driver using maven dependencies
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver firefoxDriver= new FirefoxDriver();
        firefoxDriver.get("https://www.google.com/");
        firefoxDriver.quit();

        //Setup Chrome driver using maven dependencies
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        chromeDriver.quit();

        //Setup Safari driver using maven dependencies
        SafariDriver safariDriver= new SafariDriver();
        safariDriver.get("https://www.google.com/");
        safariDriver.quit();

    }
}
