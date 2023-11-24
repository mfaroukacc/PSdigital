package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeOrderPage extends PageBase {
    WebDriver driver;

    public MakeOrderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/main/main/div[2]/ul/div[1]/div/div[3]")
    WebElement Sandwitch;
    @FindBy(xpath = "/html/body/main/header/div[2]/div/div/div[3]/ul/li[1]/a/span")
    WebElement sign_in;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form[2]/button")
    WebElement Guest;
    @FindBy(xpath = "/html/body/div[12]/div/div/div[2]/div[1]/div[3]")
    WebElement Dine_in;
    @FindBy(xpath = "/html/body/div[12]/div/div/div[2]/div[5]")
    WebElement Start_Order;

    @FindBy(xpath = "/html/body/main/main/div/div[1]/div[1]/div/div[7]/div/div/div[2]/div/div/button")
    WebElement Combo_button;

    @FindBy(xpath = "/html/body/main/main/div/div[1]/div[1]/div/div[7]/div/div/div[2]/div/div/div/div/ul/li[2]")
    WebElement Combo_type;
    @FindBy(xpath = "/html/body/main/main/div/div[1]/div[1]/div/div[7]/div/div/div[1]/a[2]/span")
    WebElement Customize;

    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[1]/div[2]/div[3]")
    WebElement LargeCombo;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]")
    WebElement Spicy;
    @FindBy(xpath = "//*[@id=\"collapseOne\"]/div/ul/li[1]/div/div/div[2]")
    WebElement AddFillet;
    @FindBy(xpath = "//*[@id=\"collapseOne\"]/div/ul/li[2]/div/div/div[2]")
    WebElement AddCheese;
    @FindBy(xpath = "//*[@id=\"scrollSection_5\"]/div[2]/div[1]/div/div[4]/div/div/div[1]")
    WebElement ClearCola;
    @FindBy(xpath = "//*[@id=\"scrollSection_5\"]/div[2]/div[4]/div/div[4]/div/div/div[2]")
    WebElement Sprite;
    @FindBy(xpath = "//*[@id=\"sidebar_fixed\"]/div/div[1]/div[2]/a\n")
    WebElement AddToCart;
    @FindBy(xpath = "//*[@id=\"chickenmeals\"]")
    WebElement Chicken_Meals;
    @FindBy(xpath = "/html/body/main/main/div/div[1]/div[1]/div/div[2]/div/div/div[1]/a/span\n")
    WebElement ChickCustom;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[1]/div[2]/div[2]")
    WebElement ChickMed;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[2]/div[2]/div[2]/div/div[3]/div/div/div[2]")
    WebElement ChickٍSpicy;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[3]/div[2]/div[1]/div/div[4]/div/div/div[1]\n")
    WebElement ClearColeslaw;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[3]/div[2]/div[2]/div/div[4]/div/div/div[2]\n")
    WebElement AddMash;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[5]/div[2]/div[1]/div/div[4]/div/div/div[2]\n")
    WebElement JalSauce;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[1]/section[5]/div[2]/div[3]/div/div[4]/div/div/div[2]\n")
    WebElement HonSauce;
    @FindBy(xpath = "/html/body/main/main/div/div[2]/div[2]/div/div[1]/div[2]/a\n")
    WebElement Chick_Cart;
    @FindBy(xpath = "/html/body/main/div/div[2]/div[2]/div/div[3]/div[2]/a")
    WebElement Order;


    @FindBy(xpath = "/html/body/main/div/div/form/div/div/div[2]/section[1]/div/div[2]/div/div[10]/div[2]")
    WebElement Next;

    @FindBy(xpath = "/html/body/main/div/div/form/div/div/div[2]/section[2]/div/div[2]/div/div[5]/div[2]")
    WebElement NextPay;
    @FindBy(xpath = "/html/body/main/div/div/form/div/div/div[2]/section[3]/div/div[3]/div[2]")
    WebElement NextSchedule;


    @FindBy(xpath = "//*[@id=\"FirstName\"]\n")
    WebElement Name;
    @FindBy(xpath = "//*[@id=\"Email\"]\n")
    WebElement Edt_Email;
    @FindBy(xpath = "//*[@id=\"Phone\"]\n")
    WebElement Edt_Phone;
    @FindBy(xpath = "/html/body/main/div/div/form/div/div/div[2]/section[4]/div/div[2]/div[1]/div[1]/label\n")
    WebElement Cash;

    public void ViewMenu() {
        Sandwitch.click();
    }

    public void GuestLogin() throws InterruptedException {

        Guest.click();
        Thread.sleep(5000);
        Dine_in.click();
        Thread.sleep(5000);
        Start_Order.click();

    }

    public void ChooseCombo() throws InterruptedException {

        Combo_button.click();
        Thread.sleep(3000);
        Combo_type.click();
        Thread.sleep(3000);
        Customize.click();


    }

    public void CustomCombo() throws InterruptedException {
        LargeCombo.click();
        Thread.sleep(3000);
        Spicy.click();
        Thread.sleep(3000);
        AddFillet.click();
        Thread.sleep(3000);
        AddCheese.click();
        Thread.sleep(3000);
        ClearCola.click();
        Thread.sleep(3000);
        Sprite.click();
        Thread.sleep(3000);
        AddToCart.click();


    }

    public void ChickMeals() throws InterruptedException {

        Chicken_Meals.click();
        Thread.sleep(3000);
        ChickCustom.click();
        Thread.sleep(3000);
        ChickMed.click();
        Thread.sleep(3000);
        ChickٍSpicy.click();
        Thread.sleep(2000);
        ClearColeslaw.click();
        Thread.sleep(2000);
        AddMash.click();
        Thread.sleep(2000);
        JalSauce.click();
        Thread.sleep(2000);
        HonSauce.click();
        Thread.sleep(2000);
        Chick_Cart.click();
        Thread.sleep(5000);
        Order.click();


    }

    public void OrderNow(String name, String email, String phone) throws InterruptedException {
        Next.click();
        Thread.sleep(3000);
        Name.sendKeys(name);
        Thread.sleep(2000);
        Edt_Email.sendKeys(email);
        Thread.sleep(2000);
        Edt_Phone.sendKeys(phone);
        Thread.sleep(5000);
        NextPay.click();
        Thread.sleep(3000);
        NextSchedule.click();
        Thread.sleep(3000);
        Cash.click();
        Thread.sleep(2000);

    }


}

