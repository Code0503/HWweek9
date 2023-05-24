package browsertesting_nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting {
    static String brower ="chrome" ;
    static WebDriver driver;
    static String url= "https://demo.nopcommerce.com/";
    static String expectedTitle = "nopCommerce Demos store";

    public static void main(String[] args) {

        if(brower.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions(); // setting up webdriver
            driver = new ChromeDriver(options);
        }else if (brower.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);}
        else if(brower.equalsIgnoreCase("edge")){
            EdgeOptions options =  new EdgeOptions();
            driver = new EdgeDriver(options);}
        else{
            System.out.println("invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        String actualTitle = driver.getTitle();
        System.out.println("Tile of page is : " + actualTitle);
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
        driver.quit();
    }
}
