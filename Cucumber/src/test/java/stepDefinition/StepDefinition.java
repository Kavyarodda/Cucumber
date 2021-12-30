package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	@Given("^User is not Netbanking landing page$")
	public void user_is_not_Netbanking_landing_page() throws Throwable {
	   System.out.println("given printed");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("when printed");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Then printed");
	}

	@Then("^cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Then2 printed");
	}



}
