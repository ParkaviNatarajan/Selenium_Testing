package functional_test_cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifySystemNavigatedToHospitalPage {
	@Test
	public void clickHospital() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.id("OSTile-hospital")).click();
		String hospitalWindow=driver.getWindowHandle();
		driver.switchTo().window(hospitalWindow);
		String hospitalTitle=driver.getTitle();
		System.out.println("Title of the page is"+" "+hospitalTitle);
		System.out.println("User naviagted to Birth and Death Registration Page");
		driver.close();
		}
}
