package stepdefinition;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	@Given("The User is in the add tariff plan page")
	public void the_User_is_in_the_add_tariff_plan_page() {
		Hook.driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user click the add tariff button")
	public void the_user_click_the_add_tariff_button() {
		HomePage hom = new HomePage();
		hom.getLink_addTariffPlan().click();

	}
}
