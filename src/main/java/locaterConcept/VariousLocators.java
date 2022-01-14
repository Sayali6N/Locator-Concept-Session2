package locaterConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void learnLocators() {
		//locater Name
		driver.findElement(By.name("firstname")).sendKeys("selenium");
//		driver.findElement(By.name("lastname")).sendKeys("1234");
		//locater id
		driver.findElement(By.id("sex-1")).click();
//below we uploaded a file.-->can use sendKey or can also use Robot Class if the tag is not input.
		driver.findElement(By.className("input-file")).sendKeys("D:\\Sayali\\selenium\\Selenium_Workspace\\LessonOne");
		//locator linkText
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
// To go back below is code.
		driver.navigate().back();
		
		//locator partialLinkText
//		driver.findElement(By.partialLinkText("TF-APIProduct")).click();
		
		//CSS Selector
		driver.findElement(By.cssSelector("input#profession-1")).click();
		driver.findElement(By.cssSelector("input[value='5']")).click();
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-1']")).click();
		
// XPath
//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun");
//Relative
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("xpath is easy");
//below is multiple relative attribute syntax.
//driver.findElement(By.xpath("//input[@name='Password' and @ type='password']")).sendKeys("this is xpath");
		
//X path fpr link --> there are 2 ways 
// 1st way formula-->Tag[text()='value']
		
//		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		
//2nd way formula-->Tag[contains(text(),'value')]
		
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
	}
//	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		}
	}
