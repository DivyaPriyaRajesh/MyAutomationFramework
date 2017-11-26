package stepdef;

import cucumber.api.java.*;
import generic.SeleniumClass;


public class HookStepDef extends SeleniumClass {
	
	@Before
	public void beforeHook() {
		super.writeExcel("sample","xyz.xls");
		super.readExcel();
		
	}
	
	@After
	public void afterHook() {
		super.getscreenshot();
		super.closeApplication();
	}

}
