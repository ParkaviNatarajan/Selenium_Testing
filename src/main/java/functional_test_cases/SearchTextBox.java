package functional_test_cases;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SearchTextBox {
	@Test
	public void linksOfThePage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchTextBox=driver.findElement(By.name("abcd"));
		searchTextBox.click();
		searchTextBox.sendKeys("Online Payment" +Keys.ENTER);
		List<WebElement> linkText=driver.findElements(By.className("lc_ styleable-title "));
		System.out.println("Links of the page are");
		for (WebElement links : linkText) {
			links.getText();
		}
		driver.close();
	}
}
