package browsertesting_herokoapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTestHerokuapp {
    static WebDriver driver;
    static  String url = "http://the-internet.herokuapp.com/login";
    static  String expectedTitle = "The Internet";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver= new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        String actualtitle= driver.getTitle();
        System.out.println("Titel of the page is : "+actualtitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualtitle));
        driver.quit();
    }
}
