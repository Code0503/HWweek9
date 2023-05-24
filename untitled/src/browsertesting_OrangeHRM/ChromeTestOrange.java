package browsertesting_OrangeHRM;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTestOrange {

    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/auth/login";
    static String expectedname="OrangeHRM";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualname= driver.getTitle();
        System.out.println("Title of page is : "+actualname );
        Assert.assertTrue(expectedname.equalsIgnoreCase(actualname));
        driver.quit();
    }


}
