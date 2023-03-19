package lt.jolanta.BTNproject.pom.tests;
import lt.jolanta.BTNproject.pom.pages.NamesSearchPage;
import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
import org.testng.annotations.BeforeMethod;


public class LanguageSearchTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        NamesSearchPage.open();
    }
}
