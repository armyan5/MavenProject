package com.maven.tests;

import com.maven.pages.DropDownPage;
import com.maven.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOfDropDown();
    }

    @Test
    public void selectDropDownTests() {
        new DropDownPage(driver).selectDropDownOption("Option 1");

    }

}
