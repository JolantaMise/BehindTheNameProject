package lt.jolanta.BTNproject.pom.tests;
import lt.jolanta.BTNproject.pom.tests.Common.BaseTest;
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

        String email = "liepavasara336@gmail.com";
        String password = "NetikrasSlaptazodis336";


    }

}
