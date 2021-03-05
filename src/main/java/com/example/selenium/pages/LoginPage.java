package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(css = ".radius")
    WebElement LoginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String text) {
        usernameField.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        passwordField.sendKeys(text);
        return this;
    }

    public LoginPage clickLogin() {
        LoginButton.click();
        return this;
    }
}
