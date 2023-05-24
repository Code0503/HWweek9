package browsertesting_HanumanjiMandirSP;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultibrowerTestHanumanjiMandir {
    static String browser = "Edge";
    static WebDriver driver;
    static String url = "https://www.salangpurhanumanji.org/";
    static String expecteTitle ="Welcome to Kashtbhanjandev Temple-Salangpur";

    public static void main(String[] args) {
        if( browser.equalsIgnoreCase("firefox")){
            FirefoxOptions options =new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }else if(browser.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            driver=new EdgeDriver(options);}else if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver=new ChromeDriver(options);
        }else { System.out.println("Invalid browser");}

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+ actualTitle);
        Assert.assertTrue(expecteTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

    }
}
