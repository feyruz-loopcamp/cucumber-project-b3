package io.loop.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.ClientPage;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClientStepDefs {

    ClientPage clientPage = new ClientPage();
    LoginPage loginPage = new LoginPage();
    private Logger LOG = LogManager.getLogger();
    private SoftAssertions softAssertions = new SoftAssertions();

    @Then("user validates {string} text is displayed")
    public void user_validates_text_is_displayed(String text) {
        BrowserUtils.justWait(5000);
       // assertTrue(loginPage.getElement(text).isDisplayed());
        String actual = loginPage.getElementText(text);
       // assertEquals("Actual text: " + actual + " does NOT match expected: " +text, actual, text);
        softAssertions.assertThat(actual).isEqualTo("sdsdsd");
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String button) {
        BrowserUtils.justWait(5000);
        clientPage.clickButton(button);
    }

    @When("user validates all assertions")
    public void user_validates_all_assertions() {
        softAssertions.assertAll();
    }
}
