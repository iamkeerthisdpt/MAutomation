package io.minga.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static io.minga.keywords.WebUI.*;

public class CommonPage {
	
	private HomePage homePage;
	private LoginPage loginPage;	
	
	
	
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
    
    public LoginPage getLoginPage() {
        if (loginPage == null) {
        	loginPage = new LoginPage();
        }
        return loginPage;
    } 
}
