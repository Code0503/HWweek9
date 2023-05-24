package browertesting_VadtalMandir;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTestVadtalMandir {static WebDriver driver;
    static String url="https://www.vadtalmandir.org/";
    static String expctedtitle="Shree Swaminarayan Mandir - Vadtal";

    public static void main(String[] args) {
        FirefoxOptions options =new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualtitle= driver.getTitle();
        System.out.println("Title of the page is : "+actualtitle);
        Assert.assertTrue(expctedtitle.equalsIgnoreCase(actualtitle));
        driver.quit();
    }
}
