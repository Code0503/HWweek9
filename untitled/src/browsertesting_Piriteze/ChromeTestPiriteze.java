package browsertesting_Piriteze;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTestPiriteze {
    static WebDriver driver;
    static String url = "https://www.piriallergy.com/product-range/piriteze/";
    static String expectedTitel="Piriteze Allergy Relief Syrup and Tablets";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertTrue(expectedTitel.equalsIgnoreCase(actualTitle));
        driver.quit();
    }

}
