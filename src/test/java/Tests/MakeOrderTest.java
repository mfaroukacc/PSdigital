package Tests;

import Pages.MakeOrderPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MakeOrderTest extends TestBase{

    @Test
    public void MakeOrder () throws InterruptedException {

        MakeOrderPage makeOrderPage=new MakeOrderPage(driver);
        makeOrderPage.ViewMenu();
        Thread.sleep(5000);
        makeOrderPage.GuestLogin();
        Thread.sleep(5000);
        makeOrderPage.ChooseCombo();
        Thread.sleep(5000);
        makeOrderPage.CustomCombo();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        makeOrderPage.ChickMeals();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)","");
        makeOrderPage.OrderNow("Mohamed Farouk","mafarouktestacc@gmail.com","0512345678");




    }
}
