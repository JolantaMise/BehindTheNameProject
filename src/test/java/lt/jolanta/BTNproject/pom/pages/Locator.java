package lt.jolanta.BTNproject.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class NamesSearchTest{
        public static By btnPlusminus_Gender = By.xpath("//span[@id='nb-plusminus-gender']");
        public static By trGenderValue = By.xpath("//tr[@id='nb-row-value-gender']");
        public static By btnInputValueGender2 = By.xpath("//label[@for='nb-input2-value-gender']");
        public static By selectOptionGenderMasculine = By.xpath("//*[@id=nb-input-value-gender]/option[2]");
        public static By btnGenderValue = By.xpath("//input[@name='value_gender']");
        public static By btnPlusMinus = By.xpath("//span[@class='nb-plusminus']");
    }

    public class HomepageTest {
        public static By inputUserMessage = By.xpath("//input[@id='main_search']");
        public static By mainSearchElement  = By.xpath("//button[@id='main_search_button']");
        public static By autocompleteInput = By.xpath("//input[@class='ui-autocomplete-input']");
        public static By nameMessage = By.xpath("//h1[@class='namebanner-title']");
        public static By toolsBtn = By.xpath("(//a)[14]");
        public static By randomRenamerBtn = By.xpath("(//a)[15]");
        public static By largeBtn1 = By.xpath("(//input[@class='largebutton'])[1]") ;
        public static By randomName = By.xpath("//div[@class='random-results']");
        public static By mainSearchSettingsBtn = By.xpath("//button[@id='main_search_settings']");
    }
}
