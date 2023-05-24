package browsertesting_CoursesUltimateqa;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeUltimateqa {
    static WebDriver driver;
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static  String expectedTitle = "Sign In - Ultimate QA";

    public static void main(String[] args) {
        ChromeOptions options =new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();
    }
}
