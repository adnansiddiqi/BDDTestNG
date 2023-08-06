package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginClass {
    public loginClass(WebDriver driver){
        this.driver = driver;
    }
    By username = By.cssSelector("#user-name");
    By Password = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@id='login-button']");
    By selectBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By basket = By.xpath("//a[@class='shopping_cart_link']");
    By checkout = By.xpath("//button[@id='checkout']");
    By firstName = By.xpath("//input[@id='first-name']");
    By lastName = By.xpath("//input[@id='last-name']");
    By postalCode = By.xpath("//input[@id='postal-code']");
    By continueBtn = By.xpath("//input[@id='continue']");
    By finishBtn = By.xpath("//button[@id='finish']");
    public WebDriver driver;
    public void launchBrowser() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(Password).sendKeys("secret_sauce");
        driver.findElement(loginBtn).click();
        WebElement backpack = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
        backpack.isDisplayed();
        driver.findElement(selectBtn).click();
        driver.findElement(basket).click();
        driver.findElement(checkout).click();
        driver.findElement(firstName).sendKeys("abd");
        driver.findElement(lastName).sendKeys("efj");
        driver.findElement(postalCode).sendKeys("xyz");
        driver.findElement(continueBtn).click();
        Thread.sleep(5000);
        driver.findElement(finishBtn).click();

    }


    public void enterEmail(String id){
        driver.findElement(username).sendKeys(id);
    }
    public void password(String password){
        driver.findElement(Password).sendKeys(password);
    }

    public void loginButton(){
    driver.findElement(loginBtn).click();
    }
}
