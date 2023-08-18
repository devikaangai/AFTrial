package Pagepackage;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
    @FindBy(id = "twotabsearchtextbox")
    WebElement Searchbox;
    @FindBy(id = "nav-search-submit-button")
    WebElement Searchbtn;
    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public SearchPage ClickSearch(String prod){
        Searchbox.click();
        Searchbox.sendKeys(prod);
        Searchbtn.click();
        return new SearchPage(driver);
    }

}
