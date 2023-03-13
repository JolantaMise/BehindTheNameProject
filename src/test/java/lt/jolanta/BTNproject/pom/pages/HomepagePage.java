package lt.jolanta.BTNproject.pom.pages;

public class HomepagePage {

    public static void open(){
        Common.openUrl("https://www.behindthename.com/");
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(Locator.HomepageTest.inputUserMessage,
        message);
    }

    public static void clickButtonShowMessage() {

    }

    public static String readMessage() {
        return Common.getElementText(Locator.HomepageTest.nameMessage);
    }

    public static void clickMainSearchElement() {
        Common.clickElement(Locator.HomepageTest.mainSearchElement);
    }

    public static void inputUserMessage(String message) {
        Common.sendKeysToElement(Locator.HomepageTest. autocompleteInput, message);

    }
}
