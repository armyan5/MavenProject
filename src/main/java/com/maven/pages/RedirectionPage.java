package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class RedirectionPage extends BasePage {
    public RedirectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a")
    List<WebElement> allLinks;


    public RedirectionPage checkLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);

        }
        return this;

    }

    private void verifyLinks(String url) {

        try {
            URL linkUrl = new URL(url);

            HttpURLConnection httpURLConnection = (HttpURLConnection) linkUrl.openConnection();
            httpURLConnection.setConnectTimeout(6000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(url + "  " + httpURLConnection.getResponseMessage() + " broken link");

            } else {
                System.out.println(url + "  " + httpURLConnection.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
