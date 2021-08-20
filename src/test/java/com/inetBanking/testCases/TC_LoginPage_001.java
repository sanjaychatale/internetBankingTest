package com.inetBanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseUrl);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Username is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickSubmit();
		
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage123"))
		{
			
			Assert.assertTrue(true);
			logger.info("Test case is passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Test case is failed");
		}
	}
}
