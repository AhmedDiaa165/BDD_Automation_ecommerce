package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D03_currencies {
    P03_HomePage homePage = new P03_HomePage();

    @Given("user navigates to home page")
    public void user_navigates_to_homePage() {
    }


    @When("user select euro symbol from currency dropdown list")
    public void userSelectEuroSymbolFromCurrencyDropdownList() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(homePage.currencies_dropdown_list());
        select.selectByVisibleText("Euro");
    }

    @Then("euro symbol should be shown on the products in home page")
    public void euroSymbolShouldBeShownOnTheProductsInHomePage() {
        for (int i = 0; i < homePage.products().size(); i++){
            Assert.assertTrue(homePage.products().get(i).getText().contains("€"));
        }


    }
}
