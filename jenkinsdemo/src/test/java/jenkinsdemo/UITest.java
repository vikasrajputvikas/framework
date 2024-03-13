package jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {
	@Parameters("Browser")
	@Test
	public void startbrowser(String browsername) throws InterruptedException {
		
		System.out.println("parameter vale :"+browsername);
		WebDriver driver = null;
		if(browsername.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(4000);
		driver.quit();
}
}