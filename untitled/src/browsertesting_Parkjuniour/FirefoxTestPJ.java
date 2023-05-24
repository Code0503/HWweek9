package browsertesting_Parkjuniour;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTestPJ {
    static WebDriver driver;
    static String url = "https://www.parkjuniorwellingborough.co.uk/";
    static String expectedTitle = "Home | Park Junior School";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String achtualTitle = driver.getTitle();
        System.out.println("Title of the page is : " + achtualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(achtualTitle));
        driver.quit();

    }

}