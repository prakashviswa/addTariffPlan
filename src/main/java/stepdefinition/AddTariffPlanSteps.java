package stepdefinition;

import cucumber.api.java.en.When;
import objectrepository.AddTariffPlan;

public class AddTariffPlanSteps {
	@When("The user fill all details in the form {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_details_in_the_form(String MonthlyRental, String FreeLocalMin, String FreeIntUnits,
			String FreeSMSPack, String LocalMinChar, String IntMinChar, String SMSperCharg) {

		AddTariffPlan plan = new AddTariffPlan();
		plan.getMonthly_Rental().sendKeys(MonthlyRental);
		plan.getLocal_minutes().sendKeys(FreeLocalMin);
		plan.getInternational_min().sendKeys(FreeIntUnits);
		plan.getSms_Pack().sendKeys(FreeSMSPack);
		plan.getMinutes_Char().sendKeys(LocalMinChar);
		plan.getInternat_Char().sendKeys(IntMinChar);
		plan.getSms_Char().sendKeys(SMSperCharg);

	}

	@When("The user submits the form")
	public void the_user_submits_the_form() {
		AddTariffPlan plan = new AddTariffPlan();
		plan.getBtn_submit().click();
	}

}
