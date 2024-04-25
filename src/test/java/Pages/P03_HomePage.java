package Pages;

import StepDef.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePage {
    public WebElement register_button(){
        return TestBase.driver.findElement(By.className("ico-register"));
    }
    public WebElement Login_button(){
        return TestBase.driver.findElement(By.className("ico-login"));
    }
    public WebElement MyAccount_isDisplayed(){
        return TestBase.driver.findElement(By.className("ico-account"));
    }
    public WebElement currencies_dropdown_list(){
        return TestBase.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> products(){
        return TestBase.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div"));
    }
    public WebElement searchBar(){
        return TestBase.driver.findElement(By.xpath("//input[@type=\"text\"]"));
    }
    public WebElement searchButton(){
        return TestBase.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }
    public WebElement dropdownList(){
        return TestBase.driver.findElement(By.id("products-pagesize"));
    }
    public List<WebElement>checkSearchResult(){
        return TestBase.driver.findElements(By.className("product-title"));
    }
    public WebElement clickOnProduct(){
        return TestBase.driver.findElement(By.className("picture"));
    }
    public WebElement check_SKU(){
        return TestBase.driver.findElement(By.className("sku"));
    }
    public WebElement mainCategories(){
        return TestBase.driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
    }
    public WebElement subCategories(){
        return TestBase.driver.findElement(By.xpath("//a[@href=\"/cell-phones\"]"));
    }
    public WebElement pageTitle(){
        return TestBase.driver.findElement(By.className("page-title"));
    }
    public WebElement FirstSlider(){
        return TestBase.driver.findElement(By.xpath("//div[@id=\"nivo-slider\"]/a[1]"));
    }
    public WebElement secondSlider(){
        return TestBase.driver.findElement(By.xpath("//div[@id=\"nivo-slider\"]"));
    }
    public WebElement FaceBook(){
        return TestBase.driver.findElement(By.className("facebook"));
    }
    public WebElement Twitter(){
        return TestBase.driver.findElement(By.className("twitter"));
    }
    public WebElement RSS(){
        return TestBase.driver.findElement(By.className("rss"));
    }
    public WebElement Youtube(){
        return TestBase.driver.findElement(By.className("youtube"));
    }
    public WebElement addToWishlistButton(){
        return TestBase.driver.findElement(By.xpath("(//div[@class=\"buttons\"]/button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
    }
    public WebElement successMessage(){
        return TestBase.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]"));
    }
    public WebElement wishlistTab(){
        return TestBase.driver.findElement(By.xpath("//a[@class=\"ico-wishlist\"]"));
    }
    public WebElement qtyValue(){
        return TestBase.driver.findElement(By.className("qty-input"));
    }

}

