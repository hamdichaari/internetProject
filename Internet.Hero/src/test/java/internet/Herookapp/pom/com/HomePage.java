package internet.Herookapp.pom.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Homepage sera le fils de BasePage 
public class HomePage extends BasePage   {

	@FindBy(tagName ="h1")
	WebElement pageTitle;
	
	@FindBy(tagName ="h2")
	WebElement subheader;

	// xpath de list 
	@FindBy(xpath="//*[@id=\"content\"]/ul/li")
	List<WebElement> allSubPages;
	
	// xpath de list de lien 
		@FindBy(xpath="//*[@id=\"content\"]/ul/li/a")
		List<WebElement> allSubPagesLinks;
	
	
	
	//redifinir la methode 
	@Override
	public String getPageTitleText() {
		// TODO Auto-generated method stub
		return pageTitle.getText();
	}
	
	// il connait driver car il est herité de base 
	//cree constructeur
		public HomePage() {
		
	     PageFactory.initElements(driver, this);

		}
	
	//  text de h2
		public String getsubheaderText() {
			return subheader.getText();
		}
	
		// methode qui get url des  pages (maping 2 chose)   / add list dans un tableau
		public List<String> getSubPagesNames(){
			
			//instance liste de array liste (constructeur array list)
			List<String> subPagesNames = new ArrayList<String>();
			for(WebElement subPage:allSubPages) {
				
		       	//	subPage.getText();
				//  add tout les text 
				subPagesNames.add(subPage.getText());
				
			}
			return subPagesNames ;
		}
		
}
