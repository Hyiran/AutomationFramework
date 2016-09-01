package com.tranings.advanceselenium.waytoautomation.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tranings.advanceselenium.waytoautomation.pages.Selectable;
import com.tranings.advanceselenium.waytoautomation.system.Init;

public class TestScriptSimpleElements {
	WebDriver driver = null;
	public final static Logger logger = Logger.getLogger(TestScriptSimpleElements.class);
	
	@BeforeSuite
	public void initialize() throws Exception { 
		//String testName = method.getName();
		//logger = report.startTest(testName);
		this.driver = Init.initiate();
		logger.info("Application is up and running");
//		Date today = new Date();
//		report=new ExtentReports(".\\Reports\\Report"+today.toString()+".html");
		
	}
	
//	/**DatePicker Test case to handle calendar**/
//	@Test
//	public void testDatePicker(){
//		DatePicker dp = new DatePicker();
//		dp.pickDate(driver,logger);
//	}
	
	
	@Test
	public void testSelectables(){
		Selectable selectItem = new Selectable();
		selectItem.Select(driver,logger);	
		}
	

//	@Test
//	public void testDynamicElements(){
//		DynamicElements de = new DynamicElements();
//		de.clickDynamicButton(driver,logger);
//	}
	
//	@Test
//	public void testAlert(){
//		Alerts al = new Alerts();
//		al.alertFunction(driver);
//	}

	@AfterSuite
	public void closeProject(){
		new Init().closeBrowser(driver,logger);
		//Init.sendMail(report,logger);
	}









}
