package Pages;

import StepDef.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage {
public WebElement male_radio_button(){
    return TestBase.driver.findElement(By.id("gender-male"));
}
    public WebElement female_radio_button() {
        return TestBase.driver.findElement(By.id("gender-female"));
    }
public WebElement firstName_TextField(){
    return TestBase.driver.findElement(By.id("FirstName"));
}
public WebElement lastname_TextField(){
    return TestBase.driver.findElement(By.id("LastName"));
}
public WebElement date_Of_BirthDay(){
    return TestBase.driver.findElement(By.name("DateOfBirthDay"));
}
    public  WebElement date_Of_BirthMonth(){
        return TestBase.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public  WebElement date_Of_BirthYear() {
        return TestBase.driver.findElement(By.name("DateOfBirthYear"));
    }
public WebElement email_TextField(){
    return TestBase.driver.findElement(By.id("Email"));
}
public WebElement password_TextField(){
    return TestBase.driver.findElement(By.id("Password"));
}
public WebElement confirm_Password_TextField(){
    return TestBase.driver.findElement(By.id("ConfirmPassword"));
}
public WebElement register_button(){
    return TestBase.driver.findElement(By.id("register-button"));
}
public WebElement registration_complete(){
    return TestBase.driver.findElement(By.xpath("//div[@class=\"result\"]"));
}

}
