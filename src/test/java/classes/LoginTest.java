package classes;

import org.checkerframework.common.reflection.qual.Invoke;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;

    public MyAccountPage myAccountPage;

    public LoginTest(){

        super();
    }


    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage= new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }

    @Test(description = "Verify Register Page with valid email and valid password ")
    public void verifyRegisterPage(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.clickOnMyAccountBtn();
        loginPage.clickHereToRegister(prop.getProperty("email"), prop.getProperty("Password") );
        softAssert.assertAll();

    }


    @Test(description = "Verify login with valid username and valid password",invocationCount = 2)
    public void verifyLogin(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.clickOnMyAccountBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccount(),"MY ACCOUNT","Text Should be My Account");
        softAssert.assertAll();
    }
    @Test(description = "Verify login with valid username and invalid password")
    public void verifyLoginWithInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.clickOnMyAccountBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("invalidPassword"));
        softAssert.assertEquals(loginPage.getTxtOfErrorOfElement(),"ERROR","Text Should be Error");
        softAssert.assertAll();
    }




    @AfterMethod
    public void afterMethod(){
        driver.close();
    }


}
