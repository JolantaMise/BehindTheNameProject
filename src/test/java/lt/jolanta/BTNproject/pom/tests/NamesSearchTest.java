package lt.jolanta.BTNproject.pom.tests;

import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lt.jolanta.BTNproject.pom.pages.NamesSearchPage;

import javax.naming.Name;
import java.util.List;

public class NamesSearchTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        NamesSearchPage.open();
    }

    @Test
    public void testBtn_GenderValue_input() {
        String expectedResult = "masculine";
        String actualResult;
        NamesSearchPage.clickBtnPlusminus_Gender();
        NamesSearchPage.clickBtnInputValueGenderMasculine();
        actualResult = NamesSearchPage.readBtnGenderValueText();
        System.out.println("atspausdinta ka nuskaite: " + actualResult);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLinkCount(){
    }

}

