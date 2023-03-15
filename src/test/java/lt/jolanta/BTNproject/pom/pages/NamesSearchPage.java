package lt.jolanta.BTNproject.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NamesSearchPage {

    public static void open() {
        Common.openUrl("https://www.behindthename.com/names/search");
    }

    public static void clickBtnPlusminus_Gender() {
        Common.clickElement(Locator.NamesSearchTest.btnPlusminus_Gender);
    }


    public static String readTrGenderValueText() {
        return Common.getElementText(Locator.NamesSearchTest.trGenderValue);
    }

    public static void clickBtnInputValueGenderMasculine() {
        Common.clickElement(Locator.NamesSearchTest.btnInputValueGender2);
    }

    public static String readBtnGenderValueText() {
        return Common.getElementText(Locator.NamesSearchTest.btnInputValueGender2);
    }

    public static void findElementGenderValueOptions() {
        Common.clickElement(Locator.NamesSearchTest.btnGenderValue);
    }

    public static void clickAllElements() {
        Common.clickElement(Locator.NamesSearchTest.btnGenderValue);
    }

    public static void clickBtnPlusMinus() {
        Common.clickElement(Locator.NamesSearchTest.btnPlusMinus);
    }

    public static void findLinks() {
        Common.findWebElement(Locator.NamesSearchTest.linkWebElement);
    }
}


