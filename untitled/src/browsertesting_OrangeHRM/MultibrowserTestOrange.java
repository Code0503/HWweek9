package browsertesting_OrangeHRM;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultibrowserTestOrange {
    static  String browser = "Firefox";
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/auth/login";
    static String expectedTitle="OrangeHRM";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);}
    else if( browser.equalsIgnoreCase("Edge")){
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);}
    else {
            System.out.println("invalid browser");}

    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
    String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

        }
    }

