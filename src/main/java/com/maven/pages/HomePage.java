package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public HomePage clickOfJavaScript() {
        click(javaScriptAlerts);
        return this;
    }

    @FindBy(xpath = "//*[@href='/windows']")
    WebElement newWindow;

    public HomePage clickOfNewWindow() {
        click(newWindow);
        return this;
    }

    @FindBy(xpath = "//*[@href='/dropdown']")
    WebElement dropDown;

    public HomePage clickOfDropDown() {
        click(dropDown);
        return this;
    }

    @FindBy(xpath = "//*[@href='/redirector']")
    WebElement redirector;

    public HomePage clickOfRedirector() {
        click(redirector);
        return this;
    }

    @FindBy(id = "redirect")
    WebElement here;

    public HomePage clickOfHere() {
        click(here);
        return this;
    }



}
