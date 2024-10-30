package internet.Hero.stepdefinitions.com;

import org.junit.Before;

import internet.Hero.com.DriverManager;
import internet.Herookapp.pom.com.BasePage;

public class CommunStepsDefinition {

	
	@Before
	public void Unit () {
		//appel de driver par le methode getdriver
		BasePage.driver= DriverManager.getDriver();
		
		
		
	}
}
