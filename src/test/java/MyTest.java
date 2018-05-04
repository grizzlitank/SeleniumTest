import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

    @Test
    public void vom_test(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rkn.gov.ru/");

    }
}
