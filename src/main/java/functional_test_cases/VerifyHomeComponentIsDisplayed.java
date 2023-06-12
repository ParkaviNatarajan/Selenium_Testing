package functional_test_cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifyHomeComponentIsDisplayed {
@Test	
public void homePage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement homeButton=driver.findElement(By.linkText("Home"));
		boolean homeButtonPresent=homeButton.isDisplayed();
		System.out.println("Home Button is present :" +" "+homeButtonPresent);
		if(homeButton.isDisplayed()) {
			homeButton.click();
			System.out.println("System is navigated to Home Page");
			System.out.println("Title of the Page is" +" "+driver.getTitle());
			driver.close();
		}
}
}
