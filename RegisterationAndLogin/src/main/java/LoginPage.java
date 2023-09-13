import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By email= By.xpath("//*[@id='Email']");
    By password= By.xpath("//*[@id='Password']");
    By loginSumit=By.xpath("//button[@class='button-1 login-button']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterEmail(String e){
        driver.findElement(email).sendKeys(e);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void ClickLoginSubmit(){
        driver.findElement(loginSumit).submit();
    }
}
