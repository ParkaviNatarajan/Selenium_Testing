package functional_test_cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifyTitleOfThePage {
	@Test
	public void titleVerification() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String expectedTitle="Welcome to Greater Chennai Corporation";
		driver.findElement(By.id("OSTile-birthCertificate")).click();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(actualTitle, expectedTitle);
		obj.assertAll();
		driver.close();
}

}
