import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by PC1 on 06.04.2016.
 */
public class Test {
   @org.testng.annotations.Test
    //public void testingWebElements() throws InterruptedException {
   public static void main() throws Exception {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*/li[1]/div/div[1]/div[1]/a/div/span/img")).click();
        driver.findElement(By.xpath(".//*[@id='movie_player']/div[1]/video")).click();
        driver.findElement(By.xpath(".//*[@id='movie_player']/div[1]/video")).click();
        System.out.println("TestWithMaven");

    }
}
