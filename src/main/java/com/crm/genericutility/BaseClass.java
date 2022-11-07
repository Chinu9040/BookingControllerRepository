package com.crm.genericutility;


	import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


	public class BaseClass {

		@BeforeSuite
		public void configureBS()
		{
			System.out.println("connect to the database");
		}
		@BeforeTest
		public void configureBT()
		{
			System.out.println("Execute the script in to the parallal mode");
		}
		@BeforeClass
		public void configureBC()
		{
			System.out.println("Launching the browser");
		}
		@BeforeMethod
		public void configureBM()
		{
			System.out.println("Login to the application");
		}
		@AfterMethod
		public void configureAM()
		{
			System.out.println("Logout from the application");
		}
		@AfterClass
		public void configureAC()
		{
			System.out.println("close the browser");
		}
		@AfterTest
		public void configureAT()
		{
			System.out.println("Close Parallel Mode");
		}
		@AfterSuite
		public void configureAS()
		{
			System.out.println("close the database connection");
		}
		
		
	}
