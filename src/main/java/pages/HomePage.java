package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.ActionsUtil;
import util.DropDownUtil;
import util.WaitUtil;
import util.WebDriverUtil;
import java.util.List;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//button[@class='CloseButton__ButtonElement-sc-79mh24-0 irFqfi annapolis-CloseButton annapolis-close annapolis-ClosePosition--top-right']")
    WebElement firstAd;
    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement secondAd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement myAccountBtn;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopElement;

    @FindBy(xpath = "//a[text()='Privacy']")
    WebElement scrollDownElement;

    @FindBy(xpath = "//a[@class='product-card product-card--margins']")
    WebElement camposProduct;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement bagSizeDropDown;

    @FindBy(xpath = "//option[text()='500g']")
    WebElement bagSize500;

    @FindBy(xpath = "//div[text()='Whole Beans']")
    WebElement wholeBeansOption;

    @FindBy(xpath = "//label[@class='pa_frequency button-group__label']")
    WebElement onceOffOption;

    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
    WebElement addQuantityBtn;

    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement addToCartBtn;
    @FindBy(xpath = "//a[text()='Privacy']")
    WebElement scrollElementText;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement mouseOverToShopElement;
    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li/a")
    List<WebElement> allShopOptions;
    @FindBy(xpath = "//a[text()='Our Story']")
    WebElement mouseOverToOurHistoryElement;

    @FindBy(xpath = "(//ul[@class='sub-menu'])[1]//li/a")
    List<WebElement> allOurStoryOptions;

    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement searchBtn;

    @FindBy(xpath = "//a[text()='Brew Guides']")
    WebElement brewGuidesBtn;

    @FindBy(xpath = "//select[@class='select ng-scope']")
    WebElement dropDownBtnOFBrewGuide;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closedFirstAD() {

        WaitUtil.waitUntilElementToBeClickable(firstAd);
    }

    public void closedSecondAd(){
        WaitUtil.waitUntilElementToBeClickable(secondAd);

    }
    public void clickOnMyAccountBtn() {
        WaitUtil.waitUntilElementToBeClickable(myAccountBtn);

    }

    public void moveMouseToShopElement() {
        WaitUtil.waitUntilElementToBeClickable(shopElement);
    }

    public void scrollDownToElementPrivacy() {
        WebDriverUtil.scrollDownToTheElement(scrollDownElement);
    }

    public void camposProductIsClickable() {
        WaitUtil.waitUntilElementToBeClickable(camposProduct);
    }

    public void bagSizeButtonIsClickable() {
        WaitUtil.waitUntilElementToBeClickable(bagSizeDropDown);
    }

    public void clickBagSize500() {
        WaitUtil.waitUntilElementToBeClickable(bagSize500);

    }

    public void selectGrindOption() {
        WaitUtil.waitUntilElementToBeClickable(wholeBeansOption);

    }

    public void selectFrequencyOption() {
        WaitUtil.waitUntilElementToBeClickable(onceOffOption);
    }

    public void addQuantity() {
        WaitUtil.waitUntilElementToBeClickable(addQuantityBtn);

    }

    public void clickOnAddToCartButton() {
        WaitUtil.waitUntilElementToBeClickable(addToCartBtn);

    }

    public String getTextOfScrollToElementPrivacy() {
        return
                WebDriverUtil.getTextOfElement(scrollElementText);
    }

    public void selectShopListOfWebElement(String options) {
        WaitUtil.waitUntilElement(mouseOverToShopElement);
        ActionsUtil.moveToWebElement(mouseOverToShopElement);
        WaitUtil.waitUntilListOFElement(allShopOptions);
        ActionsUtil.selectRandomInList(allShopOptions, options);

    }

    public void selectOurStoryListOfWebElement(String options) {
        WaitUtil.waitUntilElement(mouseOverToOurHistoryElement);
        ActionsUtil.moveToWebElement(mouseOverToOurHistoryElement);
        WaitUtil.waitUntilListOFElement(allOurStoryOptions);
        ActionsUtil.selectRandomInList(allOurStoryOptions, options);
    }

    public void clickOnSearchBtn(String coffee) {
        WebDriverUtil.sendKeysToElement(searchBtn, coffee);
    }





}
