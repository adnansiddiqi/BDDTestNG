package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginClass;

public class loginSteps {


    public WebDriver driver;
    public loginClass login;

    @Before
    public void initiate (){
        driver = new ChromeDriver();
        login= new loginClass(driver);

    }

    @After
    public void teardown(){
        if (driver!=null){
            driver.quit();
        }
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Given("user enter valid creential")
    public void user_enter_valid_creential() {
        login.enterEmail("standard_user");
        login.password("secret_sauce");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        login.loginButton();
    }

    @Then("user shuld be able to login")
    public void user_shuld_be_able_to_login() {
        System.out.printf("user is on his profile");
    }

    @Given("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String id, String password) {
        login.enterEmail(id);
        login.password(password);
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        System.out.printf("login failed");
    }

}
