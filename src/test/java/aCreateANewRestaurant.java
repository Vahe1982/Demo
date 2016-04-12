import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by EasyLunch on 12/11/2015.
 */
public class aCreateANewRestaurant {
    @Test
    public  void registrateNewRestaurant (){

            WebDriver driver = new ChromeDriver();
            driver.get("http://127.0.0.1:8080/#/login");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin@localhost");
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin");
            driver.findElement(By.xpath("html/body/div[3]/div/div/div/form/button")).click();

            WebElement element = driver.findElement(By.xpath(".//*[@id='main-header']/div/div/div[2]/div/ul/li[4]/a/span/span[2]"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);

            WebElement element1 = driver.findElement(By.xpath(".//*[@id='main-header']/div/div/div[2]/div/ul/li[4]/ul/li[1]/a/span[2]"));
            JavascriptExecutor executor1 = (JavascriptExecutor) driver;
            executor1.executeScript("arguments[0].click();", element1);

            driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div/div/button")).click();

            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[2]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[2]/input")).sendKeys("Աֆրիկյանների պանդոկ");

            WebDriverWait wait1 = new WebDriverWait(driver, 30);
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[3]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[3]/input")).sendKeys("afrikyanner_logo.png");

            WebDriverWait wait2 = new WebDriverWait(driver, 30);
            wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[4]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[4]/input")).sendKeys("Այստեղ պատրաստում են հայկական ավանդական ճաշատեսակներ. ամեն ինչ շատ համեղ է, թարմ ու տնական:");

            WebDriverWait wait3 = new WebDriverWait(driver, 30);
            wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[5]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[5]/input")).sendKeys("10");

            WebDriverWait wait4 = new WebDriverWait(driver, 30);
            wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[6]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[6]/input")).sendKeys("Հայաստան, 0015, Երևան, Մաշտոցի պող., 3 շենք");

            WebDriverWait wait5 = new WebDriverWait(driver, 30);
            wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[7]/input")));
            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[2]/div[7]/input")).sendKeys("+374-10-538862");

            driver.findElement(By.xpath(".//*[@id='saveRestaurantModal']/div/div/form/div[3]/button[2]")).click();
            driver.quit();





    }
}
