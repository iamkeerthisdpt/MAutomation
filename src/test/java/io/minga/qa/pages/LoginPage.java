package io.minga.qa.pages;

import static io.minga.keywords.WebUI.waitForPageLoaded;
import static io.minga.keywords.WebUI.clearText;
import static io.minga.keywords.WebUI.setText;
import static io.minga.keywords.WebUI.clearText;
import static io.minga.keywords.WebUI.clickElement;
import static io.minga.keywords.WebUI.openWebsite;
import static io.minga.keywords.WebUI.setText;
import static io.minga.keywords.WebUI.sleep;
import static io.minga.keywords.WebUI.verifyElementVisible;
import static io.minga.keywords.WebUI.waitForElementVisible;
import static io.minga.keywords.WebUI.waitForPageLoaded;
import static io.minga.keywords.WebUI.*;
import static io.minga.keywords.WebUI.openWebsite;

import org.openqa.selenium.By;

import io.minga.constants.FrameworkConstants;
import io.minga.keywords.WebUI;

public class LoginPage extends CommonPage{
	
    public By buttonCountry = By.xpath("//div[@title='CAN']");
    public By buttonNext = By.xpath("//button[text()='Next']");
  
    public By buttonExpand = By.xpath("//mat-panel-title[text()=' Login with username and password ']");
    public By invalidCredentials = By.xpath("//*[@class=\"ng-tns-c595-4 ng-star-inserted\"]");
    public By inputEmail = By.xpath("//input[@name='email']");
    public By inputPassword = By.xpath("//input[@type='password']");
    public By buttonNextInSignIn =By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/mg-button/button");
    
    public By linkLogout = By.xpath("//span[text()='Logout']");
    private By messageAccDoesNotExist = By.xpath("//span[@data-notify='message']");  
    
    public void loginFailWithEmailDoesNotExist(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();

        clickElement(buttonExpand);        
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        WebUI.sleep(15);
        verifyElementPresent(buttonNextInSignIn);
        clickElement(buttonNextInSignIn);
       // verifyElementVisible(invalidCredentials, "First Check.");
        
        verifyElementPresent(invalidCredentials);
        verifyElementText(invalidCredentials, " Your email address or password is incorrect. Please try again. ");
    }
    
    public void loginFailWithIncorrectPassword(String email, String password) {
        openLoginPage();
        waitForPageLoaded();
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();

        clickElement(buttonExpand);        
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        verifyElementVisible(invalidCredentials, "First Check.");
    }

    public void loginSuccessWithAdminAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    }
    public void loginSuccessWithStudentAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    	
    }
    public void loginSuccessWithTeacherAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    	
    }
    public void loginSuccessWithStaffAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    	
    }
    public void loginSuccessWithManagerAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    	
    }
    public void loginSuccessWithDistrictManagerAccount(String email, String password) {
        openLoginPage();
        //sleep(2);
        clickElement(buttonCountry);
        clickElement(buttonNext);        
        waitForPageLoaded();
        
        clickElement(buttonExpand);
        clearText(inputEmail);
        clearText(inputPassword);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonNext);
        waitForPageLoaded();
        
        clickElement(linkLogout);
    	
    }
    public void openLoginPage() {
        openWebsite(FrameworkConstants.URL_MINGA_CAN_USER);
        waitForPageLoaded();
    }
}
