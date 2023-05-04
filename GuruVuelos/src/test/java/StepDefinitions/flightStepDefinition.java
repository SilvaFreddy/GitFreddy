package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.flightStep;

public class flightStepDefinition {
    @Steps
    flightStep objSteps;

    @Given("^user open url$")
    public void user_open_url() {
objSteps.open();
    }

    @When("^user into data in form$")
    public void user_into_data_in_form() {
objSteps.clickType();
objSteps.robotPassengers();
objSteps.listDeparting();
objSteps.listDateMonthOn();
objSteps.listDateDayOn();
objSteps.listArriving();
objSteps.listDateMonthTo();
objSteps.listDateDayTo();
objSteps.clickService();
objSteps.robotAirline();
    }

    @Then("^user execute continue$")
    public void user_execute_continue() {
objSteps.clickContinue();
    }

}
