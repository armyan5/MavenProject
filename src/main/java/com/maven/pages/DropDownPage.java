package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropOption;

    public DropDownPage selectDropDownOption(String option) {
        Select select = new Select(dropOption);
        select.selectByVisibleText(option);
        return this;
    }
}
