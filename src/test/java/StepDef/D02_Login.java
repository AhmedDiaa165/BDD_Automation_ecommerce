package StepDef;

import Pages.P02_LoginPage;
import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D02_Login {
    P03_HomePage homePage=new P03_HomePage();
    P02_LoginPage login=new P02_LoginPage();
    @Given("user go to login page")
    public void user_go_to_login_page (){
        homePage.Login_button().click();
    }

    @When("user enters valid email {string} and password {string}")
    public void userEntersValidEmailAndPassword(String Email, String password) {
        login.Email_textField().sendKeys(Email);
        login.Password_textField().sendKeys(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        login.Login_Button().click();
    }

    @Then("user should be login successfully")
    public void userShouldBeLoginSuccessfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(TestBase.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(homePage.MyAccount_isDisplayed().isDisplayed());
        soft.assertAll();
    }

    @When("user enters invalid email {string} and password {string}")
    public void userEntersInvalidEmailAndPassword(String email, String password) {
        login.Email_textField().sendKeys(email);
        login.Password_textField().sendKeys(password);
    }

    @Then("user could not login")
    public void userCouldNotLogin() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(login.error_message().getText().contains("Login was unsuccessful"));
        soft.assertEquals(login.error_message().getCssValue("color"),"rgba(228, 67, 75, 1)");
        soft.assertAll();

    }
}
