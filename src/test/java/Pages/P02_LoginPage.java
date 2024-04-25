package Pages;

import StepDef.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_LoginPage {
public WebElement Email_textField(){
    return TestBase.driver.findElement(By.id("Email"));
}
public WebElement Password_textField(){
    return TestBase.driver.findElement(By.id("Password"));
}
public WebElement Login_Button(){
    return TestBase.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
}
public WebElement error_message(){
    return TestBase.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
}
}
