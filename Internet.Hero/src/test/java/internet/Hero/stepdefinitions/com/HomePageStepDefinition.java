package internet.Hero.stepdefinitions.com;

import java.util.List;

import org.junit.Assert;

import internet.Herookapp.pom.com.HomePage;

import io.cucumber.java.en.Then;


public class HomePageStepDefinition {
	
	HomePage page=new HomePage();
	
	 @Then("^the sub-header text is \"([^\"]*)\"$")
	    public void the_subheader_text_is_something(String expectedText) throws Throwable {
		 
		 String actualText = page.getsubheaderText();
		 
		 Assert.assertEquals(expectedText, actualText);
		
	    }


}
