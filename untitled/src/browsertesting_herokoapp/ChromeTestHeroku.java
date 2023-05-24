package browsertesting_herokoapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTestHeroku {
    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";
    static String expectedTitle ="The Internet";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();

    }
}
