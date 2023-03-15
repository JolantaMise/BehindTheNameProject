package lt.jolanta.BTNproject.pom.pages;

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
}


