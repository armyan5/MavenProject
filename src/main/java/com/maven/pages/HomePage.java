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


}
