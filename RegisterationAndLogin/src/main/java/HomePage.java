import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private By registerMessage= By.xpath("//div[@class='result']");
    private By loginsucess=By.xpath("//a[@class='ico-account']");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public String registerationMessage(){
        return driver.findElement(registerMessage).getText();
    }

    public boolean isMyAccountVisible(){
        if(driver.findElement(loginsucess).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
}
