package pageobjects;

import generic.SeleniumClass;

public class HomePage extends SeleniumClass{

	public void clickLink(String linkName) {
		super.element = super.identifyElements(linkName, locatorType.linkText);
		super.performAction(super.element, "click", null);
		
	}
	
	
	
}
