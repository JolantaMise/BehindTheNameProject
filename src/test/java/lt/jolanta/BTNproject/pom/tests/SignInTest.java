package lt.jolanta.BTNproject.pom.tests;
import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lt.jolanta.BTNproject.pom.pages.SignInPage;

public class SignInTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setup(){
        SignInPage.open();}

    @Test
    public void testPositiveUserSignIn_EmailPassword(){

        String emailAdress = "liepavasara336@gmail.com";
        String password = "NetikrasSlaptazodis336";
        String expectedResult ="▾";
        String actualResult;

        SignInPage.enterText(emailAdress);
        SignInPage.enterPassword(password);
        SignInPage.clickSignInBtn();
        actualResult = SignInPage.readUserName();
        System.out.println("Nuskaitytas tekstas: " + expectedResult);


        Assert.assertEquals(actualResult, expectedResult);
    }

}
