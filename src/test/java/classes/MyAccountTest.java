package classes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class MyAccountTest extends WebTestBase {

    public HomePage homePage;

    public LoginPage loginPage;

    public MyAccountPage myAccountPage;

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage= new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }

    @Test(description = "Verify Logout Btn is clickable")
    public void verifyLogoutBtn(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.clickOnMyAccountBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.logOutBtn();
        softAssert.assertEquals(myAccountPage.getTextOFAlertMessage(),"Are you sure you want to log out? Confirm and log out","Text Should be Are you sure you want to log out? Confirm and log out");
        softAssert.assertAll();



    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
