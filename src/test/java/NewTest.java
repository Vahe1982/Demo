import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * Created by PC1 on 12.04.2016.
 */
public class NewTest {
    @org.testng.annotations.Test
    public void testing() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println("Jenkins");
    }
}
