package com.toolsqa.pages;

import com.toolsqa.utilities.BrowserUtils;
import com.toolsqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath ="//h5[contains(text(),'Elements')]")
    public WebElement elements;

    public void navigateMenu(String name){
        WebElement mainManu = Driver.get().findElement(By.xpath("//h5[contains(text(),'" + name + "')]"));
        BrowserUtils.scrollToElement(mainManu);
        mainManu.click();

    }

    public void getSubMenu(String name){
        WebElement subMenu = Driver.get().findElement(By.xpath("//span[.='" + name + "']"));
        BrowserUtils.scrollToElement(subMenu);
        subMenu.click();

    }
}
