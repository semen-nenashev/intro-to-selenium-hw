package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends com.example.selenium.pages.BasePage {
    @FindBy(linkText = "Logout")
    WebElement LogoutButton;
    @FindBy(css = "h2")
    WebElement Title;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage getTitle() {
        Title.getText();
        return this;
    }

    public MainPage clickLogout() {
        LogoutButton.click();
        return this;
    }
}
