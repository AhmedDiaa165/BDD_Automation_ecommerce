package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_Wishlist {
    P03_HomePage homePage=new P03_HomePage();
    @When("user clicks on wishlist button")
    public void userClicksOnWishlistButton() throws InterruptedException {
        Thread.sleep(3000);
        homePage.addToWishlistButton().click();
    }
    @Then("verify that success message is displayed with green background color")
    public void verifyThatSuccessMessageIsDisplayedWithGreenBackgroundColor(){
      WebDriverWait wait=new WebDriverWait(TestBase.driver,Duration.ofSeconds(3));
       wait.until(ExpectedConditions.visibilityOf(homePage.successMessage()));
        SoftAssert soft=new SoftAssert();
       soft.assertTrue(homePage.successMessage().isDisplayed());
       soft.assertEquals(homePage.successMessage().getCssValue("color"),"rgba(255, 255, 255, 1)");
       soft.assertAll();
    }

    @And("Wait until success message disappears")
    public void waitUntilSuccessMessageDisappears() {
        WebDriverWait wait=new WebDriverWait(TestBase.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(homePage.successMessage()));
    }

    @And("user clicks on wishlist tap")
    public void userClicksOnWishlistTap() {
        homePage.wishlistTab().click();
    }


    @Then("verify that Qty value is greater than zero")
    public void verifyThatQtyValueIsGreaterThanZero() {
        String qty=homePage.qtyValue().getAttribute("value");
       int value=Integer.parseInt(qty);
       Assert.assertTrue(value>0);
    }
}

