package lt.jolanta.BTNproject.pom.tests;

import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lt.jolanta.BTNproject.pom.pages.HomepagePage;

public class HomepageTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        HomepagePage.open();
    }

    @Test
    public void testMainSearch_EnterUserMessage() {
        String vardas = "Adomas";
        String expectedResult = "Adomas";
        String actualResult;

        HomepagePage.enterMessage(vardas);
        HomepagePage.clickMainSearchElement();
        actualResult = HomepagePage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToolsMenu_RandomRenamer() {

        HomepagePage.selectToolsBtn();
        HomepagePage.clickRandomRenamerBtn();
        HomepagePage.clickLargeBtn1();
        HomepagePage.readRandomName();

        Assert.assertNotNull(HomepagePage.readRandomName());
    }

}


