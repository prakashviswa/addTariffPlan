package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AddTariffPlan {
	public AddTariffPlan() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(id = "rental1")
	private WebElement monthly_Rental;

	@FindBy(id = "local_minutes")
	private WebElement local_minutes;

	@FindBy(id = "inter_minutes")
	private WebElement international_min;

	@FindBy(id = "sms_pack")
	private WebElement sms_Pack;

	@FindBy(id = "minutes_charges")
	private WebElement minutes_Char;

	@FindBy(id = "inter_charges")
	private WebElement internat_Char;

	@FindBy(id = "sms_charges")
	private WebElement sms_Char;

	public WebElement getMonthly_Rental() {
		return monthly_Rental;
	}

	public WebElement getLocal_minutes() {
		return local_minutes;
	}

	public WebElement getInternational_min() {
		return international_min;
	}

	public WebElement getSms_Pack() {
		return sms_Pack;
	}

	public WebElement getMinutes_Char() {
		return minutes_Char;
	}

	public WebElement getInternat_Char() {
		return internat_Char;
	}

	public WebElement getSms_Char() {
		return sms_Char;
	}

	@FindBy(name="submit")
	private WebElement btn_submit;

	public WebElement getBtn_submit() {
		return btn_submit;
	}
	
	
}
