package users;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.JavaScriptUtil;

import pomRepository.CreateReport;

public class Acti_CreateChart_056_Test extends Base_Class {
	@Test
	 public void sample2() throws InterruptedException {
		CreateReport createReport=new CreateReport(driver);
		createReport.getReport().click();
		createReport.getCreatechart().click();
		createReport.getAdd_dashboard().click();
		String value=readFromPropertyFile.getValueProperty("value");
		createReport.getPlaceholder().sendKeys(value);
		createReport.getSaveButton().click();
        createReport.getExportToPdf().click();
		createReport.getDownloadPdf().click();
		Assert.assertEquals(value,createReport.getvalidation().getText());
		System.out.println(createReport.getvalidation().getText());
		System.out.println("done");
		 	 }

}
