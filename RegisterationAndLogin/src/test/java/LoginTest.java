import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void test1(){
        HomePage homePage=new HomePage(driver);
        LoginPage loginPage=new LoginPage(driver);
        homePage.clickOnLoginButton();
        loginPage.enterEmail("kk@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.ClickLoginSubmit();
        softAssert.assertTrue(homePage.isMyAccountVisible(),"login failed");
    }
}
