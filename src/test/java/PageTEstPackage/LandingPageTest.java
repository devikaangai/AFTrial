package PageTEstPackage;

import BasePackage.BaseClass;
import Pagepackage.HomePage;
import Pagepackage.LandingPage;
import Pagepackage.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.attribute.UserPrincipal;

public class LandingPageTest extends BaseClass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;
    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        lp= hp.clicklogin();
        land=new LandingPage(driver);
        lp.user(prop.getProperty("User"));
        lp.enterpass(prop.getProperty("Password"));
        land=lp.clicksubmit();
    }
    @Test
    public void LandTest(){
        land.ClickSearch(driver);

    }

    }
}
