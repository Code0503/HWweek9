package browsertesting_nopcommerce;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/";
    static String expectedTitle= "nopCommerce demo store";

    public static void main(String[] args) {
        EdgeOptions options= new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        String actualTitle = driver.getTitle();
        System.out.println("Title name is : " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();


    }
}
