package smoke_test_cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestingTheEntireFunctionalityOfOnlineServices {
@Test
	public void buttonsOfOnlineServices() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		System.out.println("Below are the clickable buttons in the page");
		//printing the title of Birth Certificate
		WebElement birthCertificate=driver.findElement(By.id("OSTile-birthCertificate"));
		System.out.println(birthCertificate.getText());
		System.out.println("Birth Certificate is displayed : " +birthCertificate.isDisplayed());
		WebElement deathCertificate=driver.findElement(By.id("OSTile-deathCertificate"));
		System.out.println(deathCertificate.getText());
		System.out.println("Death Certificate is displayed : " +deathCertificate.isDisplayed());
		WebElement childNameInclusion=driver.findElement(By.id("OSTile-childNameInclusion"));
		System.out.println(childNameInclusion.getText());
		System.out.println("Child Name Inclusion is displayed : " +childNameInclusion.isDisplayed());
		WebElement hospitalRegistration=driver.findElement(By.id("OSTile-hospital"));
		System.out.println(hospitalRegistration.getText());
		System.out.println("Hospital Registration is displayed : " +hospitalRegistration.isDisplayed());
		WebElement communityHall=driver.findElement(By.id("OSTile-comminityHall"));
		System.out.println(communityHall.getText());
		System.out.println("CommunityHall is displayed : " +communityHall.isDisplayed());
		WebElement townPlanning=driver.findElement(By.id("OSTile-townPlanning"));
		System.out.println(townPlanning.getText());
		System.out.println("Town Planning is displayed : " +townPlanning.isDisplayed());
		WebElement tradeLicenseSchedule=driver.findElement(By.id("OSTile-tradeLicenseSchedule"));
		System.out.println(tradeLicenseSchedule.getText());
		System.out.println("Trade License Schedule is displayed : " +townPlanning.isDisplayed());
		WebElement citizenPortal=driver.findElement(By.id("OSTile-citizenPortal"));
		System.out.println(citizenPortal.getText());
		System.out.println("Citizen Portal is displayed : " +citizenPortal.isDisplayed());
		WebElement roadCutPermission=driver.findElement(By.id("OSTile-roadCutPermission"));
		System.out.println(roadCutPermission.getText());
		System.out.println("Road Cut Permission is displayed : " +citizenPortal.isDisplayed());
	}
}
