package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserSteps {
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {
        LoginPage login = new LoginPage(driver);
        MainPage equalText = new MainPage(driver);
        login.setUsername(username).setPassword(password).clickLogin();
        Assert.assertEquals(equalText.getTitle(), "Secure Area", "Login Failed!");
        return this;
    }

    public UserSteps logout() {
        MainPage logout = new MainPage(driver);
        logout.clickLogout();
        return this;
    }
}
