package lt.jolanta.BTNproject.pom.pages;

public class SignInPage {

    public static void open(){
        Common.openUrl("https://www.behindthename.com/members/login");
    }

    public static void enterText(String emailAdress) {
        Common.sendKeysToElement(Locator.SignInTest.enterText, emailAdress);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.SignInTest.enterPassword, password);
    }

    public static void clickSignInBtn() {
        Common.clickElement(Locator.SignInTest.btnSignIn);
    }

    public static String readUserName() {
        return Common.getElementText(Locator.HomepageTest.readUserName);
    }
}
