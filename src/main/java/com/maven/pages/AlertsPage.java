package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AlertsPage extends BasePage {


    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement JSAlert;

    public AlertsPage clickJSAlert() {
        click(JSAlert);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement JSConfirm;

    public AlertsPage selectResult(String confirm) {
        click(JSConfirm);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Abbrechen")) {
            driver.switchTo().alert().dismiss(); // click na Abbrechen

        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public AlertsPage verifyResult(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));
        return this;
    }

    @FindBy(xpath = "//button[text()= 'Click for JS Prompt']")
    WebElement JSPrompt;

    public AlertsPage sendMessageToAlert(String text) {
        click(JSPrompt);
        if (text != null) {
            driver.switchTo().alert().sendKeys(text);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement messageResult;

    public AlertsPage verifyMessage(String resultText) {
        Assert.assertTrue(messageResult.getText().contains(resultText));
        return this;
    }
}
