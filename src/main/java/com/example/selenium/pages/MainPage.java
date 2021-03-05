package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends com.example.selenium.pages.BasePage {
    @FindBy(linkText = "Logout")
    WebElement LogoutButton;
    @FindBy(xpath = "//*[contains(text(), 'Secure Area')]")
    WebElement Title;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return Title.getText();
    }

    public MainPage clickLogout() {
        LogoutButton.click();
        return this;
    }
}
