package org.testingconcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends basemethods

{

 public Pojoclass()
{
	PageFactory.initElements(driver, this);
}
 
 @FindBy(id="loginAjio")
 private WebElement signin;
 
 @FindBy(name="username")
 private WebElement number;
 
 @FindBy(xpath="//input[@type='submit']")
 private WebElement contin;
 
 public WebElement getSignin() {
	return signin;
}

public void setSignin(WebElement signin) {
	this.signin = signin;
}

public WebElement getNumber() {
	return number;
}

public void setNumber(WebElement number) {
	this.number = number;
}

public WebElement getContin() {
	return contin;
}

public void setContin(WebElement contin) {
	this.contin = contin;
}


 
 

}
