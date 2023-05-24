package browsertesting_HanumanjiMandirSP;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTestHanumanjiMandir {
    static WebDriver driver;
    static String url = "https://www.salangpurhanumanji.org/";
    static String expectedtitle = "Welcome to Kashtbhanjandev Temple-Salangpur";

    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle +" : is title of the page.");
        Assert.assertTrue(expectedtitle.equalsIgnoreCase(actualTitle));
        driver.quit();
    }
}
