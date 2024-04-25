package StepDef;

import Pages.P01_RegisterPage;
import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {
    P03_HomePage homePage=new P03_HomePage();
    P01_RegisterPage registerPage=new P01_RegisterPage();
@Given("user go to register page")
    public void UserGoToRegisterPage(){
    homePage.register_button().click();
}
    @When("user select gender type")
    public void userSelectGenderType() {
    registerPage.male_radio_button().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String lastname) {
    registerPage.firstName_TextField().sendKeys(firstname);
    registerPage.lastname_TextField().sendKeys(lastname);
    }

    @And("user select date of birth {string} {string} {string}")
    public void userSelectDateOfBirth(String Day, String Month, String Year) {
    Select select=new Select(registerPage.date_Of_BirthDay());
    select.selectByVisibleText(Day);
    select=new Select(registerPage.date_Of_BirthMonth());
    select.selectByVisibleText(Month);
    select=new Select(registerPage.date_Of_BirthYear());
    select.selectByVisibleText(Year);
    }

    @And("user enter email {string}")
    public void userEnterEmail(String email) {
    registerPage.email_TextField().sendKeys(email);
    }

    @And("user enter password {string} and confirmation password {string}")
    public void userEnterPasswordAndConfirmationPassword(String password, String confirmationPassword) {
    registerPage.password_TextField().sendKeys(password);
    registerPage.confirm_Password_TextField().sendKeys(confirmationPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
    registerPage.register_button().click();
    }

    @Then("registration should be complete")
    public void registrationShouldBeComplete() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(registerPage.registration_complete().isDisplayed());
        soft.assertEquals(registerPage.registration_complete().getText(),"Your registration completed");
        soft.assertEquals(registerPage.registration_complete().getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();
    }

}
