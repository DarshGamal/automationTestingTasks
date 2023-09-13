import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void test1()  {
        RegisterPage registerPage=new RegisterPage(driver);
        HomePage homePage=new HomePage(driver);
        homePage.clickOnRegisterButton();
        registerPage.selectMaleOrFemale("male");
        registerPage.enterFirstName("mostafa");
        registerPage.enterLastName("gamal");
        registerPage.selectDay("13");
        registerPage.selectMonth("October");
        registerPage.selectYear("2001");
        registerPage.enterEmail("kk@gmail.com");
        registerPage.enterCompanyName("ejada");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickOnRegisterSubmit();
        softAssert.assertEquals(homePage.registerationMessage(),"Your registration completed");
        softAssert.assertAll();
    }
}
