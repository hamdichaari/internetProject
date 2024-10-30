package internet.Hero.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	
	//  web driver methode
	public static WebDriver getDriver() {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\eclipse-workspace\\TestListe\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=	new ChromeDriver();

	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	return driver;
	
	}

}
