import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SelectorTest {
    public static WebDriver driver;
    public WebElement TextSearch;
    public WebElement  IconeSearch ;
    public WebElement Purches ;
    public WebElement Market;

    @Test

    public void StartDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.eg/");
       // TextSearch = driver.findElement(By.id("twotabsearchtextbox"));
        //TextSearch.sendKeys("Bags");
       //IconeSearch = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
       // IconeSearch.click();
        //Purches = driver.findElement(By.cssSelector("span.nav-line-2"));
    //    Purches.click();
        Market = driver.findElement(By.partialLinkText("ماركت"));
        Market.click();




    }
}
