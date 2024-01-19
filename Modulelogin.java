package org.testingconcepts;



public class Modulelogin extends basemethods

{

	public static void main(String[] args) 
	
	{
    launchdriver();
	launchurl("https://www.ajio.com/");
	Pojoclass p=new Pojoclass();
	click(p.getSignin());
	locateandinput(p.getNumber(), "8754685936");
	click(p.getContin());
	
	}
}
