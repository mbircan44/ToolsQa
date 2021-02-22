package com.toolsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{
    @FindBy(id = "timerAlertButton")
    public WebElement timeButton;
}
