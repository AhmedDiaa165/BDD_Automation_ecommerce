package StepDef;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_HomeSliders {
    P03_HomePage homepage=new P03_HomePage();
    @When("user click on first slider")
    public void userClickOnFirstSlider() {
        TestBase.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        homepage.FirstSlider().click();
        WebDriverWait wait=new WebDriverWait(TestBase.driver, Duration.ofSeconds(3));
        wait.until( ExpectedConditions.urlMatches("\"https://demo.nopcommerce.com/nokia-lumia-1020\""));
    }

    @Then("user should be redirected to this url {string}")
    public void userShouldBeRedirectedToThisUrl(String expectedURL) {
        String actualURL=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    @When("user click on second slider")
    public void userClickOnSecondSlider(){
        TestBase.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.secondSlider().click();
        WebDriverWait wait=new WebDriverWait(TestBase.driver, Duration.ofSeconds(3));
        wait.until( ExpectedConditions.urlMatches("\"https://demo.nopcommerce.com/iphone-6\""));

    }

    @Then("user should be redirected to this URL {string}")
    public void userShouldBeRedirectedToThisURL(String expectedURL) {
        String actualURL=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }
}
