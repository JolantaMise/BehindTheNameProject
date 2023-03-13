package lt.jolanta.BTNproject.pom.tests.Common;

import lt.jolanta.BTNproject.pom.pages.Common;
import lt.jolanta.BTNproject.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setup();

    @AfterMethod
    public void teardown(){
        Common.closeDriver();
    }
}

