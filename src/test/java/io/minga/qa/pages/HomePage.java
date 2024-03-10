package io.minga.qa.pages;

import static io.minga.keywords.WebUI.openWebsite;

import io.minga.constants.FrameworkConstants;

public class HomePage extends CommonPage{

    public void openHomePage() {
        openWebsite(FrameworkConstants.URL_MINGA_CAN_USER);
    }  
    
}
