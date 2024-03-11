package com.maven.tests;

import com.maven.pages.HomePage;
import com.maven.pages.RedirectionPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectionTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOfRedirector().clickOfHere();
    }

    @Test
    public void verifyLinkTests() {
        new RedirectionPage(driver).checkLinks();
    }
}
