package lt.jolanta.BTNproject.pom.tests;

import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lt.jolanta.BTNproject.pom.pages.SignInPage;

public class SignInTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        SignInPage.open();
    }

    @Test
    public void testPositiveUserSignIn_EmailPassword() {
        String emailAdress = "liepavasara336@gmail.com";
        String password = "NetikrasSlaptazodis336";
        String expectedResult = "Vasara  ▾";
        String actualResult;

        SignInPage.enterText(emailAdress);
        SignInPage.enterPassword(password);
        SignInPage.clickSignInBtn();
        actualResult = SignInPage.readUserName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeUserSignIn_IncorrectPassword() {
        String emailAdress = "liepavasara336@gmail.com";
        String password = "Netikrasslaptazodis336";
        String expectedResult = "Password is not valid for this username.";
        String actualResult;

        SignInPage.enterText(emailAdress);
        SignInPage.enterPassword(password);
        SignInPage.clickSignInBtn();
        actualResult = SignInPage.readFieldErorMessage();

        Assert.assertEquals(actualResult, expectedResult);

    }

}

