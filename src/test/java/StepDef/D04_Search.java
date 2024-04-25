package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D04_Search {
    P03_HomePage homePage=new P03_HomePage();
    @When("user enters productName in search bar as {string}")
    public void userEntersProductNameInSearchBarAs(String productName) {
        homePage.searchBar().sendKeys(productName);
    }
    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        homePage.searchButton().click();
    }

    @And("verify that search page is opened")
    public void verifyThatSearchPageIsOpened() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(TestBase.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }
    @Then("verify that search shows relevant results {string}")
    public void verifyThatSearchShowsRelevantResults(String productName)  {
        Select select = new Select(homePage.dropdownList());
        select.selectByVisibleText("18");
        TestBase.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        int count=homePage.checkSearchResult().size();
        System.out.println(count);
        for (int i = 0; i < homePage.checkSearchResult().size(); i++) {
            SoftAssert soft = new SoftAssert();
            soft.assertTrue(homePage.checkSearchResult().get(i).getText().toLowerCase().contains(productName.toLowerCase()));
            soft.assertAll();
        }
    }

    @When("user enters sku of product in search bar as {string}")
    public void userEntersSkuOfProductInSearchBarAs(String SKU) {
        homePage.searchBar().sendKeys(SKU);
    }

    @And("user clicks on the product in search result")
    public void userClicksOnTheProductInSearchResult() {homePage.clickOnProduct().click();
    }


    @Then("verify the sku on the product matches the searched{string}")
    public void verifyTheSkuOnTheProductMatchesTheSearched(String SKU) {
        Assert.assertTrue(homePage.check_SKU().getText().contains(SKU));
    }
}
