package com.maven.tests;

import com.maven.pages.AlertsPage;
import com.maven.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlertTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOfJavaScript();

    }

    @Test
    public void clickJSAlertTest() {
        new AlertsPage(driver).clickJSAlert();

    }

    @Test
    public void clickJSConfirmTest() {
        new AlertsPage(driver);
        new AlertsPage(driver).selectResult("Abbrechen").verifyResult("Cancel");
    }

    @Test
    public void clickJSPromptTest() {
        new AlertsPage(driver);
        new AlertsPage(driver).sendMessageToAlert("Hey guys").verifyMessage("Hey guys");
    }
}