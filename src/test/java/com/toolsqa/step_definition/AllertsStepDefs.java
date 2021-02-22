package com.toolsqa.step_definition;

import com.toolsqa.pages.AlertsPage;
import com.toolsqa.utilities.BrowserUtils;
import com.toolsqa.utilities.ConfigurationReader;
import com.toolsqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class AllertsStepDefs {

    AlertsPage alertsPage = new AlertsPage();

    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);

    }

    @Then("The user should be able to click the {string} button")
    public void theUserShouldBeAbleToClickTheButton(String menuName) {

        alertsPage.navigateMenu(menuName);
    }

    @And("The user click on the {string} button")
    public void theUserClickOnTheButton(String subMenu) {
        alertsPage.getSubMenu(subMenu);
        BrowserUtils.waitFor(3);

    }

    @And("The user click on the second button and accept the alert and should be {string}")
    public void theUserClickOnTheSecondButtonAndAcceptTheAlertAndShouldBe(String expectedText) {

        alertsPage.timeButton.click();
        BrowserUtils.waitFor(5);
        Alert alert = Driver.get().switchTo().alert();
        String actualText = alert.getText();

        alert.accept();
        Assert.assertEquals(expectedText,actualText);

    }
}
