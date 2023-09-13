import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected WebDriver driver;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        softAssert=new SoftAssert();
    }
    @AfterMethod
    public void close(){
        driver.close();

    }
}
