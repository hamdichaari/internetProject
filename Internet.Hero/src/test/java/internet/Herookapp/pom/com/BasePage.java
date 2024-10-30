package internet.Herookapp.pom.com;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	
	public static String BASE_URL ="http://the-internet.herokuapp.com";
	
	//cle : string et valeur : string interface Map<key,valeur>  /
	// polymrphisme
	public static Map<String,String> PAGE_URLS = new HashMap<String,String>();
	
	//utiliser methode Put
	
	
	static {
		//appel avec le nom de page  concatener avec le url
				PAGE_URLS.put("home", BASE_URL +"/");
				PAGE_URLS.put("checkboxes", BASE_URL +"/checkboxes");
				PAGE_URLS.put("dropdown", BASE_URL +"/dropdown");
				PAGE_URLS.put("dynamic_controls", BASE_URL +"/dynamic_controls");
				PAGE_URLS.put("form authentication", BASE_URL +"/login");
				PAGE_URLS.put("inputs", BASE_URL +"/inputs");
				PAGE_URLS.put("Secure Area", BASE_URL +"/secure");
		
		
	}
	
	
	
	//declarer driver
		public static WebDriver driver;
		
		//constructeur   pour enit element (PageFactory)
		public BasePage() {
			
			PageFactory.initElements(driver,this);
		}
		
	
	
	//autre methode avec webelement
	
		//footer
		@FindBy(xpath="//a[contains(text(),'Elemental Selenium')]")
		static WebElement footerLink;
		
		@FindBy(xpath="//body/div[2]/a[1]")
		static WebElement forkMeToGithubLink;
		
		public static String GetPageFooterText() {
			return footerLink.getText();
		}
	
	
	
	//cree une methode abstract  (global pour la redifinir )
	
		public abstract String getPageTitleText();
		
	
}
