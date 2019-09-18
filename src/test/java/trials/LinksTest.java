package trials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://www.wikipedia.org/");

        //Find all the links in a web
        List<WebElement> links= chromeDriver.findElements(By.tagName("a"));
        System.out.println("count of links: "+ links.size());

        for(WebElement link: links){
            System.out.println("Link text of Link : "+ link.getAttribute("href"));
        }

        //Find the links inside a given block
        WebElement block= chromeDriver.findElement(By.className("central-featured"));

        List<WebElement> linksInsideBlock= block.findElements(By.tagName("a"));


        System.out.println("Inside a given block");

        for(WebElement linksInBlock: linksInsideBlock){
            System.out.println(linksInBlock.getAttribute("href"));
        }


        chromeDriver.quit();

    }
}
