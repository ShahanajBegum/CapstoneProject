package users;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.CreateReport;

public class Acti_CreateChart_053_Test extends Base_Class{
	
	@Test
	public void sample() {
		
		//homePage.getUsersModuleLink().click();	
		CreateReport createReport=new CreateReport(driver);
		createReport.getReport().click();
		createReport.getCreatechart().click();
		
		createReport.getAdd_dashboard().click();;
		String value=readFromPropertyFile.getValueProperty("value");
		createReport.getPlaceholder().sendKeys(value);
		createReport.getSaveButton().click();
		createReport.getClose().click();
		
		Assert.assertEquals(value,createReport.getvalidation().getText());
		
		System.out.println("done1");
		
	}
	

}
