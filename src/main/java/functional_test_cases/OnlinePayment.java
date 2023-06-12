package functional_test_cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OnlinePayment {
@Test
	public void onlinePayment() {
		WebDriverManager.chromedriver().setup();//to setup the chromedriver
		ChromeDriver driver=new ChromeDriver();//to launch chrome browser
		driver.get("https://chennaicorporation.gov.in/gcc/");//to navigate to this url
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to verify system navigated to online payment page
		driver.findElement(By.id("navTitle-onlinePayment")).click();//id selenium locator
		System.out.println("System is navigated to Online Payment page");
		driver.close();//to close the chrome page
		}
	}
