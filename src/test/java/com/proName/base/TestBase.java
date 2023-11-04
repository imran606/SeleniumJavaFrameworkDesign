package com.proName.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	//this will be acts like a parent class for all the classes
	//by using this class we initializing the followings
	
	/*
	 * webdriver
	 * properties 
	 * logs
	 * extentsreports
	 * DB part
	 * excel reading part 
	 * Mailing part
	 */

	//in order to initialize the above here we are creating some methods 
	@BeforeSuite // i want this mthod to be executed before each and every class executed
	public void setUp() {
		//here we initialize everthing
		
	}
	@AfterSuite // i want this method should be executed after all the classes will get executed  
	public void tearDown() {
		//here we quit everything 
		
	}
}
