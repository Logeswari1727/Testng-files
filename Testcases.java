package org.testingconcepts;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Testcases extends basemethods
{
	
	
	@BeforeClass
	private void launchbrowser()
	{
		launchdriver();
	}
  
	@BeforeMethod
	private void beforetimings()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@org.testng.annotations.Test
	private void Testcase1() 
	{
		launchurl("\"https://www.ajio.com/\"");
		maxiwin();
		impliwait();
		Pojoclass p=new Pojoclass();
		click(p.getSignin());
		locateandinput(p.getNumber(), "8754685936");
		click(p.getContin());
	}
	
	@AfterMethod
	private void aftertimings()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	private void closebrowser()
	{
		close();
	}
}
