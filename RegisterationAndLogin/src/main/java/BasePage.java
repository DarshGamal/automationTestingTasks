import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    private final long timeOut = 40;
    private By registerButton= By.xpath("//a[@class='ico-register']");
    private By loginButton=By.xpath("//a[@class='ico-login']");
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnRegisterButton(){driver.findElement(registerButton).click();}
    public void clickOnLoginButton(){driver.findElement(loginButton).click();}


}
