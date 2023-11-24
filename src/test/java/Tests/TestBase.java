package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.interactions.Actions;


public class TestBase {
    WebDriver driver;
@BeforeTest
public void setup() throws InterruptedException {
    driver = new FirefoxDriver();
    driver.get("https://uae.texaschicken.com/");
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,300)","");
    Thread.sleep(5000);



}

}
