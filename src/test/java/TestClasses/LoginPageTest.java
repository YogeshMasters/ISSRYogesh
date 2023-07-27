package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Com.POM.LoginPagePOM;
import Com.Utility.BaseClass;
import Com.Utility.ExcelDataProvider;

public class LoginPageTest extends BaseClass {
	
	@Test
	public void A_clickonlogin() throws Exception {
		LoginPagePOM log=new LoginPagePOM(driver);
		
		log.loginbtn();
		System.out.println("Succefully Clicked on login button");
		String username1 = ExcelDataProvider.getExcelData(0, 1) ;
	log.username(username1);
		
		System.out.println("Succefully entered Username into username field");
		String pass1 = ExcelDataProvider.getExcelData(1, 1);
		log.password(pass1);
		System.out.println("Succefully entered password into password field");
		log.signInbtn();
		System.out.println("Succefully Clicked on SignIN button");

		Thread.sleep(3000);
		log.forgotpassword();                    //click on forgot password link
		System.out.println("Clicked on forgot password link");
		
		log.enterMobilenumer();                    //Enter Number into textbox
		System.out.println("Entered mobile number into text box");
		Thread.sleep(2000);
		
//		log.click_onbproceedbtn();                //Click on proceed button
//		System.out.println("Clicked on Proceed button");
//		Thread.sleep(2000);
//		log.clickon_retuntto_login();            //Click on return to login btn
//		System.out.println("Clicked on Return to login button");
//		Thread.sleep(2000);
//		
//		log.signUpclick();                    //Click on Sign Up Link
//		System.out.println("Clicked on signUP button and Navigated");
//		log.EnterMobile_no();
//		System.out.println("Entered mobile number");
//		Thread.sleep(2000);
//		log.Enter_EmailId();
//		System.out.println("Entered EmailID number");
//		Thread.sleep(2000);
//		log.Click_on_GenerateOPT();
//		System.out.println("Clicked on generate OTP");
//		log.Clickon_Already_have_An_account_login();
//		System.out.println("navigated Return to login page");
//		log.Click_on_Terms_Condition();                                  //Click on terms and condition
//	    log.Click_on_Privacy_Policy();                                   //Click on Privacy policy 
//		
//		
//		Thread.sleep(3000);
	
		}
	@AfterMethod
	public void ss(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			ExcelDataProvider.getScreenShot(driver);
		}
	}
	
	
	
	}


