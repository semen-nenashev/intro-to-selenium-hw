package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        UserSteps user = new UserSteps(driver);
        user.login("tomsmith", "SuperSecretPassword!").logout();
    }
}
