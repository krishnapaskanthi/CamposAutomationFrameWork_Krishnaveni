package classes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;

    public HomeTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
    }
    @Test(description = "Verify Shop Element is clickable")
    public void verifyShopElement() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.moveMouseToShopElement();
        homePage.closedFirstAD();
        homePage.scrollDownToElementPrivacy();
        Thread.sleep(5000);
        softAssert.assertEquals(homePage.getTextOfScrollToElementPrivacy(),"PRIVACY","Text Should be PRIVACY");
        softAssert.assertAll();

    }
    @Test (description = "Verify product can be Added to the cart")
    public void  verifyAddToCart(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.moveMouseToShopElement();
        homePage.closedSecondAd();
        homePage.camposProductIsClickable();
        homePage.bagSizeButtonIsClickable();
        homePage.clickBagSize500();
        homePage.selectGrindOption();
        homePage.selectFrequencyOption();
        homePage.addQuantity();
        homePage.clickOnAddToCartButton();
        softAssert.assertAll();


    }
    @Test (description = "Verify Shop Option List of Element Options is clickable")
    public void verifyShopListOfElementOptions() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.selectShopListOfWebElement(prop.getProperty("shopOptions"));
        Thread.sleep(3000);
        softAssert.assertAll();

    }
    @Test (description = "Verify OurStory Option List of Element Options is clickable")
    public void verifyOurStoryListOfElementOptions() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.selectOurStoryListOfWebElement(prop.getProperty("OurStoryOptions"));
        Thread.sleep(3000);
        softAssert.assertAll();

    }
    @Test(description = "Verify search TextBox")
    public void verifySearchTextBox() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();
        homePage.clickOnSearchBtn(prop.getProperty("coffee"));
        Thread.sleep(3000);
        softAssert.assertAll();
    }
    @Test(description = "Verify Brew Guides DropDownList Is selecting ")
    public void verifyBrewGuidesDropDownList(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAD();
        homePage.closedSecondAd();


    }






    @AfterMethod
    public void afterMethod(){
        driver.close();
    }




}
