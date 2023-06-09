package lt.jolanta.BTNproject.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class SignInTest {
        public static By enterText = By.xpath("//input[@name='username']");
        public static By enterPassword = By.xpath("//input[@type='password']");
        public static By btnSignIn = By.xpath("//input[@value='Sign In']");
        public static By fieldErorMessage = By.xpath("//div[@class='field-error-msg']");
        public static By readUserName = By.xpath("//div[@id='memberoptsheading']");
    }

    public static class NamesSearchTest {
        public static By btnPlusminus_Gender = By.xpath("//span[@id='nb-plusminus-gender']");
        public static By btnInputValueGender2 = By.xpath("//label[@for='nb-input2-value-gender']");
    }

    public static class HomepageTest {
        public static By inputUserMessage = By.xpath("//input[@id='main_search']");
        public static By mainSearchElement = By.xpath("//button[@id='main_search_button']");
        public static By nameMessage = By.xpath("//h1[@class='namebanner-title']");
        public static By toolsBtn = By.xpath("(//a)[14]");
        public static By randomRenamerBtn = By.xpath("(//a)[15]");
        public static By largeBtn1 = By.xpath("(//input[@class='largebutton'])[1]");
        public static By randomName = By.xpath("//div[@class='random-results']");
    }
}
