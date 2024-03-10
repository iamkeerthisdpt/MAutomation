package io.minga.qa.testcases;

import org.testng.annotations.Test;

import io.minga.common.BaseTest;

public class HomeTest extends BaseTest{

    @Test(priority = 1)
    public void TC_LoadHomePage() {
        getHomePage().openHomePage();
    }
}
