package Pagepackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    WebElement amazonlogo;
    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    WebElement loginbtn;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public boolean checkamazonlogo(){
        return amazonlogo.isDisplayed();
    }

    public LoginPage clicklogin(){
        loginbtn.click();
        return new LoginPage(driver);
    }
}
