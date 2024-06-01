package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WaitUtil;
import util.WebDriverUtil;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountTxt;

    @FindBy(xpath =" //a[text()='Logout']")
    WebElement logOutBTn;

    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner is-success']")
    WebElement alertMsg;

    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTextOfMyAccount(){

        return WebDriverUtil.getTextOfElement(myAccountTxt);
    }

    public void logOutBtn(){
        WaitUtil.waitUntilElementToBeClickable(logOutBTn);
    }

    public String getTextOFAlertMessage(){
        return WebDriverUtil.getTextOfElement(alertMsg);
    }



}
