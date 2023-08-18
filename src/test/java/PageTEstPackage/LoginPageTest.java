package PageTEstPackage;

import BasePackage.BaseClass;
import Pagepackage.HomePage;
import Pagepackage.LandingPage;
import Pagepackage.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
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
        lp=hp.clicklogin();
        land=new LandingPage();
        //hp.clicklogin();
    }
   /* @AfterMethod
    public void Teardown(){
        driver.close();
    }*/
    @Test
    public void TestLogin(){

      lp.user(prop.getProperty("Username"));
      lp.pwd(prop.getProperty("Password"));
      land=lp.clicksubmit();
    }
    /*@Test
    public void TestLogin(){

        lp.loginmethod(prop.setProperty("Password"));
        land=lp.clickSubmit();
    }*/
}
