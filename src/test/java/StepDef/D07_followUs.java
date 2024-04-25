package StepDef;
import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;

public class D07_followUs {
    P03_HomePage homePage=new P03_HomePage();
    @When("user clicks on facebook icon")
    public void userClicksOnFacebookIcon(){
        homePage.FaceBook().click();
        WebDriverWait wait=new  WebDriverWait(TestBase.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
    @Then("facebook is opened in new tab {string}")
    public void facebookIsOpenedInNewTab(String fb_link){
        ArrayList<String> tabs=new ArrayList<>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(tabs.get(1));
        String actualUrl=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,fb_link);
        TestBase.driver.close();
    }


    @When("user clicks on twitter icon")
    public void userClicksOnTwitterIcon() {
        homePage.Twitter().click();
        WebDriverWait wait=new WebDriverWait(TestBase.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
    @Then("twitter is opened in new tab {string}")
    public void twitterIsOpenedInNewTab(String twitter_link) {
        ArrayList<String> tabs=new ArrayList<>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(tabs.get(1));
        String actualURL=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualURL,twitter_link);
        TestBase.driver.close();
    }


    @When("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        homePage.RSS().click();
        WebDriverWait wait=new WebDriverWait(TestBase.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("rss is opened in new tab {string}")
    public void rssIsOpenedInNewTab(String rss_link) {
        ArrayList<String> tabs=new ArrayList<>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(tabs.get(1));
        String actualURL=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualURL,rss_link);
        TestBase.driver.close();
    }


    @When("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        homePage.Youtube().click();
        WebDriverWait wait=new WebDriverWait(TestBase.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("youtube is opened in new tab {string}")
    public void youtubeIsOpenedInNewTab(String youtube_link) {
        ArrayList<String> tabs=new ArrayList<>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(tabs.get(1));
        String actualURL=TestBase.driver.getCurrentUrl();
        Assert.assertEquals(actualURL,youtube_link);
        TestBase.driver.close();
    }
}
