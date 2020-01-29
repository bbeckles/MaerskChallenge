package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BlazeSite.BlazeSite;
import org.example.SeleniumConfig.SeleniumConfig;

public class BlazeHomeStepDefs {

    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tcadmin/Desktop/chromedriver/chromedriver");
    private static BlazeSite blazeSite = new BlazeSite(seleniumConfig.getDriver());


    // Scenario: I am able to select my flight location

    @Given("I am on the travel The world page")
    public void i_am_on_the_travel_the_world_page() {
        blazeSite.blazeHome.goToBlazeHome();
    }

    @When("I select the my departure location")
    public void i_select_my_depart_location() {
        blazeSite.blazeHome.clickDepLink();
    }

    @And("I select my destination location")
    public void i_select_my_destination_location() {
        blazeSite.blazeHome.clickDesLink();

    }

    @Then("I click upon the submit button")
    public void i_click_the_submit_button(){
        blazeSite.blazeHome.clickSubmit();
    }

    @Given("I have selected my destination already")
    public void iHaveSelectedMyDestinationAlready() {
        blazeSite.blazeHome.goToBlazeHome().clickDepLink().clickDesLink().clickSubmit().clickChooseFlight();
    }


    @When("I fill out the form")
    public void iFillOutTheForm() {
        blazeSite.blazeDetails.fillInName("John").fillInAddress("my address")
                .fillCity("city").fillState("state").fillZipcode("zip")
                .fillCardNumber("12345678").fillCardMonth("12")
                .fillCardYear("2000").fillCardName("John Doe");
    }

    @And("I have clicked remember me")
    public void iClickRemeberMe() {
        blazeSite.blazeDetails.tickRememberMe();

    }

    @Then("I will be able to get to the confirmation page")
    public void iWillBeAbleToGetToTheConfirmationPage() {
        blazeSite.blazeDetails.submitForm();
    }
}



