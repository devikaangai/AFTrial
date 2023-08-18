package Pagepackage;/*

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Base64;

public class Loginpagepwd extends BaseClass {
    @FindBy(id = "ap_password")
    WebElement pwd;
    @FindBy(id= "signInSubmit")
    WebElement signin;
    public Loginpagepwd(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void loginmethod(String pwd){

      // pwd.sendkeys

    }
    public LandingPage clickSubmit(){
        submit.click();
        return new LandingPage();
    }
}
*/