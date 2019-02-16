package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AccessPage {
	public AccessPage() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath = "//h2[text()='Congratulation you add Tariff Plan']")
	private WebElement congrats_addTariff;

	public WebElement getCongrats_addTariff() {
		return congrats_addTariff;
	}

}
