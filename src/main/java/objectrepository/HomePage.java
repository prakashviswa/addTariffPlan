package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement link_addTariffPlan;

	public WebElement getLink_addTariffPlan() {
		return link_addTariffPlan;
	}

}
