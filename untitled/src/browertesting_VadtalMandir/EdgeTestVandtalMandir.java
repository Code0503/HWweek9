package browertesting_VadtalMandir;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTestVandtalMandir {
    static WebDriver driver;
    static String url = "https://www.vadtalmandir.org/";
    static String expected ="Shree Swaminarayan Mandir - Vadtal";

    public static void main(String[] args) {
        EdgeOptions options= new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String ActualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+ ActualTitle);
        Assert.assertTrue(expected.equalsIgnoreCase(ActualTitle));
        driver.quit();
    }
}
