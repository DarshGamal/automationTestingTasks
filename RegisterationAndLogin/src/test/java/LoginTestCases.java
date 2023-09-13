import org.testng.annotations.Test;

public class LoginTestCases extends BaseTest{
    LoginPage loginPage;
    HomePage homePage;
    @Test(priority = 0)
    public void loginWithValidEmailAndPassword(){
        homePage=new HomePage(driver);
        loginPage =new LoginPage(driver);
        homePage.clickOnLoginButton();
        loginPage.enterEmail("kk@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.ClickLoginSubmit();
    }
    @Test(priority = 1)
    public void loginWithInValidEmail(){
        homePage=new HomePage(driver);
        loginPage =new LoginPage(driver);
        homePage.clickOnLoginButton();
        loginPage.enterEmail("uu@gmail.com");
        loginPage.enterPassword("1236456");
        loginPage.ClickLoginSubmit();
    }
    @Test(priority = 2)
    public void loginWithEmptyEmail(){
        homePage=new HomePage(driver);
        loginPage =new LoginPage(driver);
        homePage.clickOnLoginButton();
        loginPage.enterEmail("");
        loginPage.enterPassword("1236456");
        loginPage.ClickLoginSubmit();
    }

}
