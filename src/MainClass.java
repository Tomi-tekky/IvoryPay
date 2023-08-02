import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class MainClass {
    WebDriver driver;
    @BeforeClass
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "C://BrowserDriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
    }
    @Test()
    void LaunchBrowser() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://qa.d1ainun5cjrnni.amplifyapp.com");
        System.out.println("Welcome to IvoryPay landing page");
        Thread.sleep(3000);
    }
}