import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{
    private By maleButton=By.xpath("//*[@id='gender-male']");
    private By femaleButton=By.xpath("//*[@id='gender-female']");
    private By firstName=By.xpath("//*[@id='FirstName']");
    private By lastName=By.xpath("//*[@id='LastName']");
    private By day=By.xpath("//select[@name='DateOfBirthDay']");
    private By month=By.xpath("//select[@name='DateOfBirthMonth']");
    private By year=By.xpath("//select[@name='DateOfBirthYear']");
    private By email=By.xpath("//*[@id='Email']");
    private By Company=By.xpath("//*[@id='Company']");
    private By password=By.xpath("//*[@id='Password']");
    private By ConfirmPassword=By.xpath("//*[@id='ConfirmPassword']");
    private By registerSubmit=By.xpath("//*[@id='register-button']");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void selectMaleOrFemale(String option){
        if (option.equalsIgnoreCase("male")){
            driver.findElement(maleButton).click();
        } else if (option.equalsIgnoreCase("female")) {
            driver.findElement(femaleButton).click();
        }else {
            System.out.println("please select male or female.");
        }
    }
    public void enterFirstName(String fname){driver.findElement(firstName).sendKeys(fname);}
    public void enterLastName(String lname){driver.findElement(lastName).sendKeys(lname);}
    public void selectDay(String dayValue){
        Select Oday=new Select(driver.findElement(day));
        Oday.selectByValue(dayValue);
    }
    public void selectMonth(String monthDay){
        Select Omonth=new Select(driver.findElement(month));
        Omonth.selectByVisibleText(monthDay);
    }
    public void selectYear(String yearValue){
        Select Oyear=new Select(driver.findElement(year));
        Oyear.selectByValue(yearValue);
    }
    public void enterEmail(String mail){driver.findElement(email).sendKeys(mail);}
    public void enterCompanyName(String cname){driver.findElement(Company).sendKeys(cname);}
    public void enterPassword(String pass){driver.findElement(password).sendKeys(pass);}
    public void enterConfirmPassword(String cpass){driver.findElement(ConfirmPassword).sendKeys(cpass);}
    public void clickOnRegisterSubmit(){driver.findElement(registerSubmit).click();}
}
