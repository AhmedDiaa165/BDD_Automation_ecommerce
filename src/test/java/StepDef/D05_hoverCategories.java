package StepDef;


import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class D05_hoverCategories {
    P03_HomePage homePage=new P03_HomePage();

    @When("user hover over a electronics categories")
    public void userHoverOnElectronicsCategories() {
        Actions actions=new Actions(TestBase.driver);
        actions.moveToElement(homePage.mainCategories()).perform();
    }

    @And("user clicks on cell phones")
    public void userClicksOnCellPhones() {
       homePage.subCategories().click();
    }

    @Then("verify that page title matches the sub categories title")
    public void verifyThatPageTitleMatchesTheSubCategoriesTitle() {
        String pageTitle = homePage.pageTitle().getText().toLowerCase().trim();
        String subCategories=homePage.subCategories().getText().toLowerCase().trim();
        Assert.assertTrue(pageTitle.contains(subCategories));

    }
}
