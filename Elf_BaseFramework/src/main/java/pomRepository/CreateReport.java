package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateReport   {
	public CreateReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='content reports']") 
	private WebElement report;
	
	@FindBy(xpath="//span[contains(text(),'Create Chart')]") 
	private WebElement createchart ;


	//@FindBy(xpath="//div[.='Add to Dashboard']")
	@FindBy(xpath="//div[@class='addToDashboard']")
	//@FindBy(xpath="//div[@class='addToDashboardIcon']")
    private WebElement add_dashboard;
  
	
	@FindBy(xpath="//input[@placeholder='Enter Chart Name']")	
	private WebElement placeholder;
	
	@FindBy(xpath="//td[@class='saveNewConfigButton greyButton']")
	private WebElement save_button;
	
	@FindBy(xpath="//div[@id='createChartLightbox_cancelBtn']")
	private WebElement close;
	
	@FindBy(xpath="(//div[@class='buttonIcon'])[6]")
	private WebElement exportToPdf; 
	
	//@FindBy(xpath="(//div[@id='createChartLightbox_downloadPdfBtn')")
	@FindBy(xpath="//span[.='Download PDF']")
	private WebElement downloadPdf;
	
	@FindBy(xpath="(//div[@class='closeButton'])[5]")
	private WebElement closeicon;

	public WebElement getDownloadPdf() {
		return downloadPdf;
	}
	 



	public WebElement getSave_button() {
		return save_button;
	}



	public  WebElement getReport() {
		return report;
	}

	public WebElement getCreatechart() {
		return createchart;
	}

	public WebElement getAdd_dashboard() {
		return add_dashboard;
	}

	public WebElement getPlaceholder() {
		return placeholder;
	}

	public WebElement getSaveButton() {
		return save_button;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getExportToPdf() {
		// TODO Auto-generated method stub
		return exportToPdf;
	}
	
	public WebElement getCloseicon() {
		return closeicon;
	}
	//@FindBy(xpath="//(//span[.='Create Chart']/../../../../../../../../../../../../../../..//div[@class='config-name'])[8]") 
	@FindBy(xpath="//span[.='Create Chart']/../../../../../../../../../../../../../../../div[11]/table[2]/tbody[1]/tr[4]/td[2]/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[2]/td/div/div[1]")
	private WebElement validation;
	
	@FindBy(xpath="//td[contains(text(),'Reports Dashboard')]")
	private WebElement reporttitle;
	

	

	public WebElement getvalidation() {
		return validation;
	}




	public WebElement getReportTitle() {
		// TODO Auto-generated method stub
		return reporttitle;
	}
	}
	


	


