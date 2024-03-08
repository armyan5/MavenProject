package com.maven.tests;

import com.maven.pages.BrowserWindowsPage;
import com.maven.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOfNewWindow();
    }


    @Test
    public void selectNewWindowTest() {
        new BrowserWindowsPage(driver).switchToNextTab(1).verifyNewTabText("New Window");

    }
}
