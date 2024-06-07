package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondStepDefinitions {

    @Given("a second example scenario")
    public void anExampleScenario() {
    }

    @When("all second step definitions are implemented")
    public void allStepDefinitionsAreImplemented() throws InterruptedException {
        Thread.sleep(10000);
    }

    @Then("the second scenario passes")
    public void theScenarioPasses() {
    }

}
