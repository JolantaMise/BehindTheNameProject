package lt.jolanta.BTNproject.pom.pages;

import lt.jolanta.BTNproject.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    private static List<WebElement> getElements(By locator) {

        return Driver.getDriver().findElements(locator);
    }

    public static void closeDriver() {
    Driver.closeDriver();}

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickElement(By locator) { getElement(locator).click();
    }
}