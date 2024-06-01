package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;
import java.util.List;

import static testbase.WebTestBase.driver;

public class ActionsUtil extends WebTestBase {
    public static Actions actions;


    public static void moveToWebElement(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();

    }

    public static void dragAndDropToElement(WebElement srcElement, WebElement descElement) {
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, descElement)
                .build()
                .perform();

    }

    public static void clickONTheElement(WebElement element) {
        actions = new Actions(driver);
        actions.click(element)
                .build();

    }

    public static void selectRandomInList(List<WebElement> elementList, String option) {
        for (WebElement element : elementList) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
                break;
            }
        }


    }
}