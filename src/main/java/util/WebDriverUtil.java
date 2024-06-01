package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

public class WebDriverUtil extends WebTestBase {

    public static void sendKeysToElement(WebElement element, String text){
        element.sendKeys(text);

    }

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public static void scrollDownToTheElement(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);

    }


}
