package lt.jolanta.BTNproject.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static By Elements = By.xpath("//button[@id='main_search_button']");

    public class HomepageTest {
        public static By inputUserMessage = By.xpath("//input[@id='main_search']");
        public static By nameBannerTitle = By.xpath("//*[@id=body-inner]/div[1]/div/h1");
        public static By mainSearchElement  = By.xpath("//button[@id='main_search_button']");
        public static By autocompleteInput = By.xpath("//input[@class='ui-autocomplete-input']");
        public static By nameMessage = By.xpath("//h1[@class='namebanner-title']");
    }
}
