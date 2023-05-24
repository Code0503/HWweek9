package browsertesting_herokoapp;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTestHerokuapp {
    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";
    static String ectualTitle = "The Internet";

    public static void main(String[] args) {
        EdgeOptions options =new EdgeOptions();
        driver= new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is : "+actualTitle);
        Assert.assertTrue(ectualTitle.equalsIgnoreCase(actualTitle));
        driver.quit();


    }
}
