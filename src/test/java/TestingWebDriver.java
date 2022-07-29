import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWebDriver {


    @Test
    public void WebKa(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flowers gift\n");

        driver.findElement(By.xpath("//a[text()='Коханій']")).click();




    }

}
