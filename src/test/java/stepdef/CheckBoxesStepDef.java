package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.CheckBoxPage;
import pageobjects.DropDownPage;

public class CheckBoxesStepDef {
	
	CheckBoxPage cb = new CheckBoxPage();
	
	@Then("^click checkbox (\\d+)$")
	public void click_checkbox(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cb.clickCheckbox(arg1);
	    
	}

}
