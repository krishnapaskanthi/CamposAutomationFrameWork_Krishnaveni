package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WaitUtil;
import util.WebDriverUtil;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement loginUserNameTextBox;

    @FindBy(id = "password")
    WebElement loginPasswordTextBox;

    @FindBy(name = "login" )
    WebElement loginBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement errorElementForWrongPassword;

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickHereBtn;
    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement registerEmailTextBox;
    @FindBy(xpath ="//input[@id='reg_password']" )
    WebElement registerPasswordTextBox;
    @FindBy(xpath = "//span[text()='Sign up to the Campos Coffee Newsletter']")
    WebElement signUpCheckBox;
    @FindBy(xpath = "//input[@name='register']")
    WebElement registerBtn;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void login(String username , String password){
        WebDriverUtil.sendKeysToElement(loginUserNameTextBox, username);
        WebDriverUtil.sendKeysToElement(loginPasswordTextBox,password);
        WaitUtil.waitUntilElementToBeClickable(loginBtn);
    }

    public String getTxtOfErrorOfElement(){
        return   WebDriverUtil.getTextOfElement(errorElementForWrongPassword);
    }

    public void clickHereToRegister(String email, String Password){
        WaitUtil.waitUntilElementToBeClickable(clickHereBtn);
        WebDriverUtil.sendKeysToElement(registerEmailTextBox,email);
        WebDriverUtil.sendKeysToElement(registerPasswordTextBox,Password);
        WaitUtil.waitUntilElementToBeClickable(signUpCheckBox);
        WaitUtil.waitUntilElementToBeClickable(registerBtn);



    }





}
