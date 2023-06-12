package integration_test_cases;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class PrintingDeathCertificate {
	@Test
	public void printingDeathCertificate() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chennaicorporation.gov.in/gcc/online-services/#");
		//To print the title of the page
		String printTitle=driver.getTitle();
		System.out.println(printTitle);
		driver.findElement(By.id("OSTile-deathCertificate")).click();
		WebElement dateDropList=driver.findElement(By.id("sel_day"));
		Select selectDate=new Select(dateDropList);
		selectDate.selectByVisibleText("25");
		WebElement monthDropList=driver.findElement(By.id("sel_month"));
		Select selectMonth=new Select(monthDropList);
		selectMonth.selectByVisibleText("October");
		WebElement yearDropList=driver.findElement(By.id("sel_year"));
		Select selectYear=new Select(yearDropList);
		selectYear.selectByVisibleText("1996");
		//To click the Gender
		driver.findElement(By.id("gender-2")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> totalRows= driver.findElements(By.xpath("//table//tbody/tr"));
		System.out.println("Total Rows"+" "+totalRows.size());
		for(int i=1;i<=totalRows.size();i++) {
			List<WebElement> totalColumns= driver.findElements(By.xpath("//table//tbody/tr["+i+"]/td"));
			for(int j=1;j<=totalColumns.size();j++) {
				WebElement columnNames=	driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+j+"]"));
				String header=columnNames.getText();
				System.out.print(header+"     ");
			}
			System.out.println();
		}
	}
}
