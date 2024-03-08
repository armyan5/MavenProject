package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/windows/new']")
    WebElement clickHere;

    public BrowserWindowsPage switchToNextTab(int index) {
        click(clickHere);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//h3")
    WebElement newWindow;

    public BrowserWindowsPage verifyNewTabText(String text) {
        Assert.assertTrue(shouldHaveText(newWindow, text, 5));
        return this;
    }

    private boolean shouldHaveText(WebElement element, String text, int index) {
        return new WebDriverWait(driver, Duration.ofSeconds(index))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
