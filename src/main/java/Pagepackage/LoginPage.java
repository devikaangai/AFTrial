package Pagepackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    @FindBy(id="ap_email")
    WebElement user;
    @FindBy(id = "continue")

   WebElement submit;

    @FindBy(id="ap_password")
    WebElement pwd;

    @FindBy(id="signInSubmit")
    WebElement signin;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void user(String Username){
        user.sendKeys(Username);
        submit.click();
    }
    public void pwd(String Password){
        pwd.sendKeys(Password);
    }
    public LandingPage clicksubmit(){
        submit.click();
        return new LandingPage(driver);
    }
   /*public void loginmethod(String un){
        user.sendKeys(un);
    }
    public LandingPage clickSubmit(){
        submit.click();
        return new LandingPage();
    }
    public void loginmethod(String pd){
        pwd.sendKeys(pd);
    }

    public LandingPage clickSubmit() {
        signin.click();
        return new LandingPage();
    }
    */

}
