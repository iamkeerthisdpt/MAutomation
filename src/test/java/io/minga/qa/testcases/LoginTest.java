package io.minga.qa.testcases;

import org.testng.annotations.Test;

import io.minga.constants.FrameworkConstants;
import io.minga.helpers.ExcelHelpers;

import io.minga.common.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void TC_LoginFailWithEmailDoesNotExist() {
		ExcelHelpers excel = new ExcelHelpers();
		excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
		getLoginPage().loginFailWithEmailDoesNotExist(excel.getCellData(1, "email"), excel.getCellData(1, "password"));
	}

	@Test(priority = 2)
	public void TC_LoginFailWithIncorrectPassword() {
		ExcelHelpers excel = new ExcelHelpers();
		excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
		getLoginPage().loginFailWithIncorrectPassword(excel.getCellData(2, "email"), excel.getCellData(2, "password"));
	}
	/*
	 * @Test(priority = 3) public void TC_LoginSuccessWithAdminAccount() {
	 * ExcelHelpers excel = new ExcelHelpers();
	 * excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	 * getLoginPage().loginSuccessWithAdminAccount(excel.getCellData(3, "email"),
	 * excel.getCellData(3, "password")); }
	 */
	
	  @Test(priority = 3) public void TC_LoginSuccessWithAdminAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithAdminAccount(excel.getCellData(3, "email"),
	  excel.getCellData(3, "password")); }
	  
	  @Test(priority = 4) public void TC_LoginSuccessWithStudentAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithStudentAccount(excel.getCellData(4, "email"),
	  excel.getCellData(4, "password")); }
	  
	  @Test(priority = 5) public void TC_LoginSuccessWithTeacherAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithTeacherAccount(excel.getCellData(5, "email"),
	  excel.getCellData(5, "password")); }
	  
	  @Test(priority = 6) public void TC_LoginSuccessWithStaffAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithStaffAccount(excel.getCellData(6, "email"),
	  excel.getCellData(6, "password")); }
	  
	  @Test(priority = 7) public void TC_LoginSuccessWithManagerAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithManagerAccount(excel.getCellData(7, "email"),
	  excel.getCellData(7, "password")); }
	  
	  @Test(priority = 8) public void TC_LoginSuccessWithDistrictManagerAccount() {
	  ExcelHelpers excel = new ExcelHelpers();
	  excel.setExcelFile(FrameworkConstants.EXCEL_MINGA_LOGIN, "Login");
	  getLoginPage().loginSuccessWithDistrictManagerAccount(excel.getCellData(8,
	  "email"), excel.getCellData(8, "password")); }
	 }
