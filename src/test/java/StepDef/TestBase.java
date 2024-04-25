package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
    public static WebDriver driver;
    @Before
    public void openBrowser (){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowser () throws InterruptedException {
        Thread.sleep(2000);
    driver.quit();
    }
}
