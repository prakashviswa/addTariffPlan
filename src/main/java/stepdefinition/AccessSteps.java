package stepdefinition;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import objectrepository.AccessPage;

public class AccessSteps {

	@Then("I validate whether user submitted the form")
	public void i_validate_whether_user_submitted_the_form() {
		AccessPage pag = new AccessPage();
		Assert.assertTrue(pag.getCongrats_addTariff().isDisplayed());
	}

}
